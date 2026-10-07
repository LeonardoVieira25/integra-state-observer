#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$ROOT_DIR"

MAIN_CLASS="Main"

echo "==> Compilando o projeto..."
mvn -q compile

echo "==> Executando a classe principal ${MAIN_CLASS}..."
java -cp "target/classes" "${MAIN_CLASS}"
