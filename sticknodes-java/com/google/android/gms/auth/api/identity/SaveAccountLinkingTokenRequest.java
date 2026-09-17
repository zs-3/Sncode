package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SaveAccountLinkingTokenRequestCreator")
/* loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest> CREATOR = null;
    public static final java.lang.String EXTRA_TOKEN = "extra_token";
    public static final java.lang.String TOKEN_TYPE_AUTH_CODE = "auth_code";

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getConsentPendingIntent", id = 1)
    private final android.app.PendingIntent zba;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTokenType", id = 2)
    private final java.lang.String zbb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getServiceId", id = 3)
    private final java.lang.String zbc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getScopes", id = 4)
    private final java.util.List zbd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSessionId", id = 5)
    private final java.lang.String zbe;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTheme", id = 6)
    private final int zbf;

    /* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
    public static final class Builder {
        private android.app.PendingIntent zba;
        private java.lang.String zbb;
        private java.lang.String zbc;
        private java.util.List zbd;
        private java.lang.String zbe;
        private int zbf;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.zbd = r0
                return
        }

        public com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest build() {
                r9 = this;
                android.app.PendingIntent r0 = r9.zba
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                java.lang.String r3 = "Consent PendingIntent cannot be null"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r3)
                java.lang.String r0 = r9.zbb
                java.lang.String r3 = "auth_code"
                boolean r0 = r3.equals(r0)
                java.lang.String r3 = "Invalid tokenType"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r3)
                java.lang.String r0 = r9.zbc
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r0 = r0 ^ r2
                java.lang.String r3 = "serviceId cannot be null or empty"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r3)
                java.util.List r0 = r9.zbd
                if (r0 == 0) goto L2c
                r1 = 1
            L2c:
                java.lang.String r0 = "scopes cannot be null"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
                com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest r0 = new com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest
                android.app.PendingIntent r3 = r9.zba
                java.lang.String r4 = r9.zbb
                java.lang.String r5 = r9.zbc
                java.util.List r6 = r9.zbd
                java.lang.String r7 = r9.zbe
                int r8 = r9.zbf
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return r0
        }

        public com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder setConsentPendingIntent(android.app.PendingIntent r1) {
                r0 = this;
                r0.zba = r1
                return r0
        }

        public com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder setScopes(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.zbd = r1
                return r0
        }

        public com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder setServiceId(java.lang.String r1) {
                r0 = this;
                r0.zbc = r1
                return r0
        }

        public com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder setTokenType(java.lang.String r1) {
                r0 = this;
                r0.zbb = r1
                return r0
        }

        public final com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder zba(java.lang.String r1) {
                r0 = this;
                r0.zbe = r1
                return r0
        }

        public final com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder zbb(int r1) {
                r0 = this;
                r0.zbf = r1
                return r0
        }
    }

    static {
            com.google.android.gms.auth.api.identity.zbp r0 = new com.google.android.gms.auth.api.identity.zbp
            r0.<init>()
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    SaveAccountLinkingTokenRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) android.app.PendingIntent r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.util.List r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) int r6) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            r0.zbb = r2
            r0.zbc = r3
            r0.zbd = r4
            r0.zbe = r5
            r0.zbf = r6
            return
    }

    public static com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder builder() {
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$Builder r0 = new com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$Builder
            r0.<init>()
            return r0
    }

    public static com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder zba(com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest r2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$Builder r0 = builder()
            java.util.List r1 = r2.getScopes()
            r0.setScopes(r1)
            java.lang.String r1 = r2.getServiceId()
            r0.setServiceId(r1)
            android.app.PendingIntent r1 = r2.getConsentPendingIntent()
            r0.setConsentPendingIntent(r1)
            java.lang.String r1 = r2.getTokenType()
            r0.setTokenType(r1)
            int r1 = r2.zbf
            r0.zbb(r1)
            java.lang.String r2 = r2.zbe
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L33
            r0.zba(r2)
        L33:
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest r4 = (com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest) r4
            java.util.List r0 = r3.zbd
            int r0 = r0.size()
            java.util.List r2 = r4.zbd
            int r2 = r2.size()
            if (r0 != r2) goto L51
            java.util.List r0 = r3.zbd
            java.util.List r2 = r4.zbd
            boolean r0 = r0.containsAll(r2)
            if (r0 != 0) goto L21
            goto L51
        L21:
            android.app.PendingIntent r0 = r3.zba
            android.app.PendingIntent r2 = r4.zba
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L51
            java.lang.String r0 = r3.zbb
            java.lang.String r2 = r4.zbb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L51
            java.lang.String r0 = r3.zbc
            java.lang.String r2 = r4.zbc
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L51
            java.lang.String r0 = r3.zbe
            java.lang.String r2 = r4.zbe
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L51
            int r0 = r3.zbf
            int r4 = r4.zbf
            if (r0 != r4) goto L51
            r4 = 1
            return r4
        L51:
            return r1
    }

    public android.app.PendingIntent getConsentPendingIntent() {
            r1 = this;
            android.app.PendingIntent r0 = r1.zba
            return r0
    }

    public java.util.List<java.lang.String> getScopes() {
            r1 = this;
            java.util.List r0 = r1.zbd
            return r0
    }

    public java.lang.String getServiceId() {
            r1 = this;
            java.lang.String r0 = r1.zbc
            return r0
    }

    public java.lang.String getTokenType() {
            r1 = this;
            java.lang.String r0 = r1.zbb
            return r0
    }

    public int hashCode() {
            r3 = this;
            android.app.PendingIntent r0 = r3.zba
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = r3.zbb
            r2 = 1
            r1[r2] = r0
            java.lang.String r0 = r3.zbc
            r2 = 2
            r1[r2] = r0
            java.util.List r0 = r3.zbd
            r2 = 3
            r1[r2] = r0
            java.lang.String r0 = r3.zbe
            r2 = 4
            r1[r2] = r0
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            android.app.PendingIntent r1 = r4.getConsentPendingIntent()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r6 = r4.getTokenType()
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            java.lang.String r6 = r4.getServiceId()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            java.util.List r6 = r4.getScopes()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r5, r1, r6, r3)
            java.lang.String r6 = r4.zbe
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            int r6 = r4.zbf
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
