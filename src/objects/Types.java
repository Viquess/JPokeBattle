package objects;

public enum Types {
    NORMALE(new String[]{}, new String[]{"ROCCIA", "ACCIAIO"}, new String[]{"SPETTRO"}),
    FUOCO(new String[]{"ERBA", "GHIACCIO", "COLEOTTERO", "ACCIAIO"}, new String[]{"FUOCO", "ACQUA", "ROCCIA", "DRAGO"}, new String[]{}),
    ACQUA(new String[]{"FUOCO", "TERRA", "ROCCIA"}, new String[]{"ACQUA", "ERBA", "DRAGO"}, new String[]{}),
    ERBA(new String[]{"ACQUA", "TERRA", "ROCCIA"}, new String[]{"FUOCO", "ERBA", "VELENO", "VOLANTE", "COLEOTTERO", "DRAGO", "ACCIAIO"}, new String[]{}),
    ELETTRO(new String[]{"ACQUA", "VOLANTE"}, new String[]{"ERBA", "ELETTRO", "DRAGO"}, new String[]{"TERRA"}),
    GHIACCIO(new String[]{"ERBA", "TERRA", "VOLANTE", "DRAGO"}, new String[]{"FUOCO", "ACQUA", "GHIACCIO", "ACCIAIO"}, new String[]{}),
    LOTTA(new String[]{"NORMALE", "GHIACCIO", "ROCCIA", "BUIO", "ACCIAIO"}, new String[]{"VELENO", "VOLANTE", "PSICO", "COLEOTTERO", "FOLLETTO"}, new String[]{"SPETTRO"}),
    VELENO(new String[]{"ERBA", "FOLLETTO"}, new String[]{"VELENO", "TERRA", "ROCCIA", "SPETTRO"}, new String[]{"ACCIAIO"}),
    TERRA(new String[]{"FUOCO", "ELETTRO", "VELENO", "ROCCIA", "ACCIAIO"}, new String[]{"ERBA", "COLEOTTERO"}, new String[]{"VOLANTE"}),
    VOLANTE(new String[]{"ERBA", "LOTTA", "COLEOTTERO"}, new String[]{"ELETTRO", "ROCCIA", "ACCIAIO"}, new String[]{}),
    PSICO(new String[]{"LOTTA", "VELENO"}, new String[]{"PSICO", "ACCIAIO"}, new String[]{"BUIO"}),
    COLEOTTERO(new String[]{"ERBA", "PSICO", "BUIO"}, new String[]{"FUOCO", "LOTTA", "VELENO", "VOLANTE", "SPETTRO", "ACCIAIO", "FOLLETTO"}, new String[]{}),
    ROCCIA(new String[]{"FUOCO", "GHIACCIO", "VOLANTE", "COLEOTTERO"}, new String[]{"LOTTA", "TERRA", "ACCIAIO"}, new String[]{}),
    SPETTRO(new String[]{"PSICO", "SPETTRO"}, new String[]{"BUIO"}, new String[]{"NORMALE"}),
    DRAGO(new String[]{"DRAGO"}, new String[]{"ACCIAIO"}, new String[]{"FOLLETTO"}),
    BUIO(new String[]{"PSICO", "SPETTRO"}, new String[]{"LOTTA", "BUIO", "FOLLETTO"}, new String[]{}),
    ACCIAIO(new String[]{"GHIACCIO", "ROCCIA", "FOLLETTO"}, new String[]{"FUOCO", "ACQUA", "ELETTRO", "ACCIAIO"}, new String[]{}),
    FOLLETTO(new String[]{"LOTTA", "DRAGO", "BUIO"}, new String[]{"FUOCO", "VELENO", "ACCIAIO"}, new String[]{});

    private String[] superEffective, notVeryEffective, noEffect;

    Types(String[] superEffective, String[] notVeryEffective, String[] noEffect) {
        this.superEffective = superEffective;
        this.notVeryEffective = notVeryEffective;
        this.noEffect = noEffect;
    }
}
