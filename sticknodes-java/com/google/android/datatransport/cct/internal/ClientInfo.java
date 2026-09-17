package com.google.android.datatransport.cct.internal;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class ClientInfo {

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.android.datatransport.cct.internal.ClientInfo build();

        public abstract com.google.android.datatransport.cct.internal.ClientInfo.Builder setAndroidClientInfo(com.google.android.datatransport.cct.internal.AndroidClientInfo r1);

        public abstract com.google.android.datatransport.cct.internal.ClientInfo.Builder setClientType(com.google.android.datatransport.cct.internal.ClientInfo.ClientType r1);
    }

    public enum ClientType extends java.lang.Enum<com.google.android.datatransport.cct.internal.ClientInfo.ClientType> {
        private static final /* synthetic */ com.google.android.datatransport.cct.internal.ClientInfo.ClientType[] $VALUES = null;
        public static final com.google.android.datatransport.cct.internal.ClientInfo.ClientType ANDROID_FIREBASE = null;
        public static final com.google.android.datatransport.cct.internal.ClientInfo.ClientType UNKNOWN = null;
        private final int value;

        static {
                com.google.android.datatransport.cct.internal.ClientInfo$ClientType r0 = new com.google.android.datatransport.cct.internal.ClientInfo$ClientType
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.google.android.datatransport.cct.internal.ClientInfo.ClientType.UNKNOWN = r0
                com.google.android.datatransport.cct.internal.ClientInfo$ClientType r1 = new com.google.android.datatransport.cct.internal.ClientInfo$ClientType
                java.lang.String r3 = "ANDROID_FIREBASE"
                r4 = 1
                r5 = 23
                r1.<init>(r3, r4, r5)
                com.google.android.datatransport.cct.internal.ClientInfo.ClientType.ANDROID_FIREBASE = r1
                r3 = 2
                com.google.android.datatransport.cct.internal.ClientInfo$ClientType[] r3 = new com.google.android.datatransport.cct.internal.ClientInfo.ClientType[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.google.android.datatransport.cct.internal.ClientInfo.ClientType.$VALUES = r3
                return
        }

        ClientType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static com.google.android.datatransport.cct.internal.ClientInfo.ClientType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.datatransport.cct.internal.ClientInfo$ClientType> r0 = com.google.android.datatransport.cct.internal.ClientInfo.ClientType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.datatransport.cct.internal.ClientInfo$ClientType r1 = (com.google.android.datatransport.cct.internal.ClientInfo.ClientType) r1
                return r1
        }

        public static com.google.android.datatransport.cct.internal.ClientInfo.ClientType[] values() {
                com.google.android.datatransport.cct.internal.ClientInfo$ClientType[] r0 = com.google.android.datatransport.cct.internal.ClientInfo.ClientType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.datatransport.cct.internal.ClientInfo$ClientType[] r0 = (com.google.android.datatransport.cct.internal.ClientInfo.ClientType[]) r0
                return r0
        }
    }

    public ClientInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.cct.internal.ClientInfo.Builder builder() {
            com.google.android.datatransport.cct.internal.AutoValue_ClientInfo$Builder r0 = new com.google.android.datatransport.cct.internal.AutoValue_ClientInfo$Builder
            r0.<init>()
            return r0
    }

    public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo getAndroidClientInfo();

    public abstract com.google.android.datatransport.cct.internal.ClientInfo.ClientType getClientType();
}
