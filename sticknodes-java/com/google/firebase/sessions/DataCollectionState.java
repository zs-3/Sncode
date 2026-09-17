package com.google.firebase.sessions;

/* compiled from: SessionEvent.kt */
/* loaded from: classes2.dex */
public enum DataCollectionState extends java.lang.Enum<com.google.firebase.sessions.DataCollectionState> implements com.google.firebase.encoders.json.NumberedEnum {
    private static final /* synthetic */ com.google.firebase.sessions.DataCollectionState[] $VALUES = null;
    public static final com.google.firebase.sessions.DataCollectionState COLLECTION_DISABLED = null;
    public static final com.google.firebase.sessions.DataCollectionState COLLECTION_DISABLED_REMOTE = null;
    public static final com.google.firebase.sessions.DataCollectionState COLLECTION_ENABLED = null;
    public static final com.google.firebase.sessions.DataCollectionState COLLECTION_SAMPLED = null;
    public static final com.google.firebase.sessions.DataCollectionState COLLECTION_SDK_NOT_INSTALLED = null;
    public static final com.google.firebase.sessions.DataCollectionState COLLECTION_UNKNOWN = null;
    private final int number;

    private static final /* synthetic */ com.google.firebase.sessions.DataCollectionState[] $values() {
            r0 = 6
            com.google.firebase.sessions.DataCollectionState[] r0 = new com.google.firebase.sessions.DataCollectionState[r0]
            com.google.firebase.sessions.DataCollectionState r1 = com.google.firebase.sessions.DataCollectionState.COLLECTION_UNKNOWN
            r2 = 0
            r0[r2] = r1
            com.google.firebase.sessions.DataCollectionState r1 = com.google.firebase.sessions.DataCollectionState.COLLECTION_SDK_NOT_INSTALLED
            r2 = 1
            r0[r2] = r1
            com.google.firebase.sessions.DataCollectionState r1 = com.google.firebase.sessions.DataCollectionState.COLLECTION_ENABLED
            r2 = 2
            r0[r2] = r1
            com.google.firebase.sessions.DataCollectionState r1 = com.google.firebase.sessions.DataCollectionState.COLLECTION_DISABLED
            r2 = 3
            r0[r2] = r1
            com.google.firebase.sessions.DataCollectionState r1 = com.google.firebase.sessions.DataCollectionState.COLLECTION_DISABLED_REMOTE
            r2 = 4
            r0[r2] = r1
            com.google.firebase.sessions.DataCollectionState r1 = com.google.firebase.sessions.DataCollectionState.COLLECTION_SAMPLED
            r2 = 5
            r0[r2] = r1
            return r0
    }

    static {
            com.google.firebase.sessions.DataCollectionState r0 = new com.google.firebase.sessions.DataCollectionState
            java.lang.String r1 = "COLLECTION_UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.firebase.sessions.DataCollectionState.COLLECTION_UNKNOWN = r0
            com.google.firebase.sessions.DataCollectionState r0 = new com.google.firebase.sessions.DataCollectionState
            java.lang.String r1 = "COLLECTION_SDK_NOT_INSTALLED"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.google.firebase.sessions.DataCollectionState.COLLECTION_SDK_NOT_INSTALLED = r0
            com.google.firebase.sessions.DataCollectionState r0 = new com.google.firebase.sessions.DataCollectionState
            java.lang.String r1 = "COLLECTION_ENABLED"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.google.firebase.sessions.DataCollectionState.COLLECTION_ENABLED = r0
            com.google.firebase.sessions.DataCollectionState r0 = new com.google.firebase.sessions.DataCollectionState
            java.lang.String r1 = "COLLECTION_DISABLED"
            r2 = 3
            r0.<init>(r1, r2, r2)
            com.google.firebase.sessions.DataCollectionState.COLLECTION_DISABLED = r0
            com.google.firebase.sessions.DataCollectionState r0 = new com.google.firebase.sessions.DataCollectionState
            java.lang.String r1 = "COLLECTION_DISABLED_REMOTE"
            r2 = 4
            r0.<init>(r1, r2, r2)
            com.google.firebase.sessions.DataCollectionState.COLLECTION_DISABLED_REMOTE = r0
            com.google.firebase.sessions.DataCollectionState r0 = new com.google.firebase.sessions.DataCollectionState
            java.lang.String r1 = "COLLECTION_SAMPLED"
            r2 = 5
            r0.<init>(r1, r2, r2)
            com.google.firebase.sessions.DataCollectionState.COLLECTION_SAMPLED = r0
            com.google.firebase.sessions.DataCollectionState[] r0 = $values()
            com.google.firebase.sessions.DataCollectionState.$VALUES = r0
            return
    }

    DataCollectionState(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.number = r3
            return
    }

    public static com.google.firebase.sessions.DataCollectionState valueOf(java.lang.String r1) {
            java.lang.Class<com.google.firebase.sessions.DataCollectionState> r0 = com.google.firebase.sessions.DataCollectionState.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.firebase.sessions.DataCollectionState r1 = (com.google.firebase.sessions.DataCollectionState) r1
            return r1
    }

    public static com.google.firebase.sessions.DataCollectionState[] values() {
            com.google.firebase.sessions.DataCollectionState[] r0 = com.google.firebase.sessions.DataCollectionState.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.firebase.sessions.DataCollectionState[] r0 = (com.google.firebase.sessions.DataCollectionState[]) r0
            return r0
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    public int getNumber() {
            r1 = this;
            int r0 = r1.number
            return r0
    }
}
