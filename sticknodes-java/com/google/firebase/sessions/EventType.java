package com.google.firebase.sessions;

/* compiled from: SessionEvent.kt */
/* loaded from: classes2.dex */
public enum EventType extends java.lang.Enum<com.google.firebase.sessions.EventType> implements com.google.firebase.encoders.json.NumberedEnum {
    private static final /* synthetic */ com.google.firebase.sessions.EventType[] $VALUES = null;
    public static final com.google.firebase.sessions.EventType EVENT_TYPE_UNKNOWN = null;
    public static final com.google.firebase.sessions.EventType SESSION_START = null;
    private final int number;

    private static final /* synthetic */ com.google.firebase.sessions.EventType[] $values() {
            r0 = 2
            com.google.firebase.sessions.EventType[] r0 = new com.google.firebase.sessions.EventType[r0]
            com.google.firebase.sessions.EventType r1 = com.google.firebase.sessions.EventType.EVENT_TYPE_UNKNOWN
            r2 = 0
            r0[r2] = r1
            com.google.firebase.sessions.EventType r1 = com.google.firebase.sessions.EventType.SESSION_START
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            com.google.firebase.sessions.EventType r0 = new com.google.firebase.sessions.EventType
            java.lang.String r1 = "EVENT_TYPE_UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.firebase.sessions.EventType.EVENT_TYPE_UNKNOWN = r0
            com.google.firebase.sessions.EventType r0 = new com.google.firebase.sessions.EventType
            java.lang.String r1 = "SESSION_START"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.google.firebase.sessions.EventType.SESSION_START = r0
            com.google.firebase.sessions.EventType[] r0 = $values()
            com.google.firebase.sessions.EventType.$VALUES = r0
            return
    }

    EventType(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.number = r3
            return
    }

    public static com.google.firebase.sessions.EventType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.firebase.sessions.EventType> r0 = com.google.firebase.sessions.EventType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.firebase.sessions.EventType r1 = (com.google.firebase.sessions.EventType) r1
            return r1
    }

    public static com.google.firebase.sessions.EventType[] values() {
            com.google.firebase.sessions.EventType[] r0 = com.google.firebase.sessions.EventType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.firebase.sessions.EventType[] r0 = (com.google.firebase.sessions.EventType[]) r0
            return r0
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    public int getNumber() {
            r1 = this;
            int r0 = r1.number
            return r0
    }
}
