package com.google.android.datatransport.cct.internal;

/* loaded from: classes.dex */
final class AutoValue_ClientInfo extends com.google.android.datatransport.cct.internal.ClientInfo {
    private final com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo;
    private final com.google.android.datatransport.cct.internal.ClientInfo.ClientType clientType;

    /* renamed from: com.google.android.datatransport.cct.internal.AutoValue_ClientInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.ClientInfo.Builder {
        private com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo;
        private com.google.android.datatransport.cct.internal.ClientInfo.ClientType clientType;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public com.google.android.datatransport.cct.internal.ClientInfo build() {
                r4 = this;
                com.google.android.datatransport.cct.internal.AutoValue_ClientInfo r0 = new com.google.android.datatransport.cct.internal.AutoValue_ClientInfo
                com.google.android.datatransport.cct.internal.ClientInfo$ClientType r1 = r4.clientType
                com.google.android.datatransport.cct.internal.AndroidClientInfo r2 = r4.androidClientInfo
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public com.google.android.datatransport.cct.internal.ClientInfo.Builder setAndroidClientInfo(com.google.android.datatransport.cct.internal.AndroidClientInfo r1) {
                r0 = this;
                r0.androidClientInfo = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public com.google.android.datatransport.cct.internal.ClientInfo.Builder setClientType(com.google.android.datatransport.cct.internal.ClientInfo.ClientType r1) {
                r0 = this;
                r0.clientType = r1
                return r0
        }
    }

    private AutoValue_ClientInfo(com.google.android.datatransport.cct.internal.ClientInfo.ClientType r1, com.google.android.datatransport.cct.internal.AndroidClientInfo r2) {
            r0 = this;
            r0.<init>()
            r0.clientType = r1
            r0.androidClientInfo = r2
            return
    }

    /* synthetic */ AutoValue_ClientInfo(com.google.android.datatransport.cct.internal.ClientInfo.ClientType r1, com.google.android.datatransport.cct.internal.AndroidClientInfo r2, com.google.android.datatransport.cct.internal.AutoValue_ClientInfo.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.datatransport.cct.internal.ClientInfo
            r2 = 0
            if (r1 == 0) goto L38
            com.google.android.datatransport.cct.internal.ClientInfo r5 = (com.google.android.datatransport.cct.internal.ClientInfo) r5
            com.google.android.datatransport.cct.internal.ClientInfo$ClientType r1 = r4.clientType
            if (r1 != 0) goto L16
            com.google.android.datatransport.cct.internal.ClientInfo$ClientType r1 = r5.getClientType()
            if (r1 != 0) goto L36
            goto L20
        L16:
            com.google.android.datatransport.cct.internal.ClientInfo$ClientType r3 = r5.getClientType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L36
        L20:
            com.google.android.datatransport.cct.internal.AndroidClientInfo r1 = r4.androidClientInfo
            if (r1 != 0) goto L2b
            com.google.android.datatransport.cct.internal.AndroidClientInfo r5 = r5.getAndroidClientInfo()
            if (r5 != 0) goto L36
            goto L37
        L2b:
            com.google.android.datatransport.cct.internal.AndroidClientInfo r5 = r5.getAndroidClientInfo()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L36
            goto L37
        L36:
            r0 = 0
        L37:
            return r0
        L38:
            return r2
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public com.google.android.datatransport.cct.internal.AndroidClientInfo getAndroidClientInfo() {
            r1 = this;
            com.google.android.datatransport.cct.internal.AndroidClientInfo r0 = r1.androidClientInfo
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public com.google.android.datatransport.cct.internal.ClientInfo.ClientType getClientType() {
            r1 = this;
            com.google.android.datatransport.cct.internal.ClientInfo$ClientType r0 = r1.clientType
            return r0
    }

    public int hashCode() {
            r3 = this;
            com.google.android.datatransport.cct.internal.ClientInfo$ClientType r0 = r3.clientType
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            r2 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r2
            int r0 = r0 * r2
            com.google.android.datatransport.cct.internal.AndroidClientInfo r2 = r3.androidClientInfo
            if (r2 != 0) goto L16
            goto L1a
        L16:
            int r1 = r2.hashCode()
        L1a:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ClientInfo{clientType="
            r0.append(r1)
            com.google.android.datatransport.cct.internal.ClientInfo$ClientType r1 = r2.clientType
            r0.append(r1)
            java.lang.String r1 = ", androidClientInfo="
            r0.append(r1)
            com.google.android.datatransport.cct.internal.AndroidClientInfo r1 = r2.androidClientInfo
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
