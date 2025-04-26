-- Active: 1744137910213@@127.0.0.1@5432@banco
-- Active: 1744137910213@@127.0.0.1@5432@organizacao0213@@127.0.0.1@5432@postgres0213@@127.0.0.1@5432@banco0213@@127.0.0.1@5432@lixo_eletronico@public0213@@127.0.0.1@5432@postgres0213@@127.0.0.1@5432@banco@public0213@@127.0.0.1@5432@postgres
select * from ponto_de_coleta;

DROP DATABASE banco;

SELECT pg_terminate_backend(pg_stat_activity.pid)
FROM pg_stat_activity
WHERE pg_stat_activity.datname = 'banco'
  AND pid <> pg_backend_pid();

  CREATE DATABASE organizacao;