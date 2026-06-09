class RequiredFieldException extends ValidationException {
    public RequiredFieldException(String field) {
        super(field, "REQUIRED", "Campo obrigatório não informado.");
    }
}