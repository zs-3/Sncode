package com.google.firebase.sessions;

/* compiled from: ApplicationInfo.kt */
/* loaded from: classes2.dex */
public enum LogEnvironment extends java.lang.Enum<com.google.firebase.sessions.LogEnvironment> implements com.google.firebase.encoders.json.NumberedEnum {
    private static final /* synthetic */ com.google.firebase.sessions.LogEnvironment[] $VALUES = null;
    public static final com.google.firebase.sessions.LogEnvironment LOG_ENVIRONMENT_AUTOPUSH = null;
    public static final com.google.firebase.sessions.LogEnvironment LOG_ENVIRONMENT_PROD = null;
    public static final com.google.firebase.sessions.LogEnvironment LOG_ENVIRONMENT_STAGING = null;
    public static final com.google.firebase.sessions.LogEnvironment LOG_ENVIRONMENT_UNKNOWN = null;
    private final int number;

    private static final /* synthetic */ com.google.firebase.sessions.LogEnvironment[] $values() {
            r0 = 4
            com.google.firebase.sessions.LogEnvironment[] r0 = new com.google.firebase.sessions.LogEnvironment[r0]
            com.google.firebase.sessions.LogEnvironment r1 = com.google.firebase.sessions.LogEnvironment.LOG_ENVIRONMENT_UNKNOWN
            r2 = 0
            r0[r2] = r1
            com.google.firebase.sessions.LogEnvironment r1 = com.google.firebase.sessions.LogEnvironment.LOG_ENVIRONMENT_AUTOPUSH
            r2 = 1
            r0[r2] = r1
            com.google.firebase.sessions.LogEnvironment r1 = com.google.firebase.sessions.LogEnvironment.LOG_ENVIRONMENT_STAGING
            r2 = 2
            r0[r2] = r1
            com.google.firebase.sessions.LogEnvironment r1 = com.google.firebase.sessions.LogEnvironment.LOG_ENVIRONMENT_PROD
            r2 = 3
            r0[r2] = r1
            return r0
    }

    static {
            com.google.firebase.sessions.LogEnvironment r0 = new com.google.firebase.sessions.LogEnvironment
            java.lang.String r1 = "LOG_ENVIRONMENT_UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.firebase.sessions.LogEnvironment.LOG_ENVIRONMENT_UNKNOWN = r0
            com.google.firebase.sessions.LogEnvironment r0 = new com.google.firebase.sessions.LogEnvironment
            java.lang.String r1 = "LOG_ENVIRONMENT_AUTOPUSH"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.google.firebase.sessions.LogEnvironment.LOG_ENVIRONMENT_AUTOPUSH = r0
            com.google.firebase.sessions.LogEnvironment r0 = new com.google.firebase.sessions.LogEnvironment
            java.lang.String r1 = "LOG_ENVIRONMENT_STAGING"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.google.firebase.sessions.LogEnvironment.LOG_ENVIRONMENT_STAGING = r0
            com.google.firebase.sessions.LogEnvironment r0 = new com.google.firebase.sessions.LogEnvironment
            java.lang.String r1 = "LOG_ENVIRONMENT_PROD"
            r2 = 3
            r0.<init>(r1, r2, r2)
            com.google.firebase.sessions.LogEnvironment.LOG_ENVIRONMENT_PROD = r0
            com.google.firebase.sessions.LogEnvironment[] r0 = $values()
            com.google.firebase.sessions.LogEnvironment.$VALUES = r0
            return
    }

    LogEnvironment(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.number = r3
            return
    }

    public static com.google.firebase.sessions.LogEnvironment valueOf(java.lang.String r1) {
            java.lang.Class<com.google.firebase.sessions.LogEnvironment> r0 = com.google.firebase.sessions.LogEnvironment.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.firebase.sessions.LogEnvironment r1 = (com.google.firebase.sessions.LogEnvironment) r1
            return r1
    }

    public static com.google.firebase.sessions.LogEnvironment[] values() {
            com.google.firebase.sessions.LogEnvironment[] r0 = com.google.firebase.sessions.LogEnvironment.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.firebase.sessions.LogEnvironment[] r0 = (com.google.firebase.sessions.LogEnvironment[]) r0
            return r0
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    public int getNumber() {
            r1 = this;
            int r0 = r1.number
            return r0
    }
}
