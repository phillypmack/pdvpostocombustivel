-- 1) adicionar a coluna que falta
ALTER TABLE pessoas
    ADD COLUMN IF NOT EXISTS tipo_pessoa VARCHAR(15);

-- 2) preencher os registros existentes (escolha um default)
UPDATE pessoas SET tipo_pessoa = 'FISICA' WHERE tipo_pessoa IS NULL;

-- 3) tornar NOT NULL (igual à entidade)
ALTER TABLE pessoas
    ALTER COLUMN tipo_pessoa SET NOT NULL;

-- 4) criar UNIQUE em cpf_cnpj (necessário para ON CONFLICT)
DO $$
BEGIN
    IF NOT EXISTS (
        SELECT 1 FROM pg_constraint
        WHERE conname = 'uk_pessoas_cpf_cnpj'
    ) THEN
        ALTER TABLE pessoas
            ADD CONSTRAINT uk_pessoas_cpf_cnpj UNIQUE (cpf_cnpj);
    END IF;
END$$;