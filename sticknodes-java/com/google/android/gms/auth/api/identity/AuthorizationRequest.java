package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AuthorizationRequestCreator")
/* loaded from: classes.dex */
public class AuthorizationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.AuthorizationRequest> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRequestedScopes", id = 1)
    private final java.util.List zba;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getServerClientId", id = 2)
    private final java.lang.String zbb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isOfflineAccessRequested", id = 3)
    private final boolean zbc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isIdTokenRequested", id = 4)
    private final boolean zbd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAccount", id = 5)
    private final android.accounts.Account zbe;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getHostedDomain", id = 6)
    private final java.lang.String zbf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSessionId", id = 7)
    private final java.lang.String zbg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isForceCodeForRefreshToken", id = 8)
    private final boolean zbh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getResourceParameters", id = 9)
    private final android.os.Bundle zbi;

    /* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
    public static final class Builder {
        private java.util.List zba;
        private java.lang.String zbb;
        private boolean zbc;
        private boolean zbd;
        private android.accounts.Account zbe;
        private java.lang.String zbf;
        private java.lang.String zbg;
        private boolean zbh;
        private android.os.Bundle zbi;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        private final java.lang.String zbc(java.lang.String r3) {
                r2 = this;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
                java.lang.String r0 = r2.zbb
                r1 = 1
                if (r0 == 0) goto L10
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto Lf
                goto L10
            Lf:
                r1 = 0
            L10:
                java.lang.String r0 = "two different server client ids provided"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
                return r3
        }

        public com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder addResourceParameter(com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "Resource parameter cannot be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                java.lang.String r0 = "Resource parameter value cannot be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                android.os.Bundle r0 = r1.zbi
                if (r0 != 0) goto L15
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r1.zbi = r0
            L15:
                android.os.Bundle r0 = r1.zbi
                java.lang.String r2 = r2.zba
                r0.putString(r2, r3)
                return r1
        }

        public com.google.android.gms.auth.api.identity.AuthorizationRequest build() {
                r11 = this;
                com.google.android.gms.auth.api.identity.AuthorizationRequest r10 = new com.google.android.gms.auth.api.identity.AuthorizationRequest
                java.util.List r1 = r11.zba
                java.lang.String r2 = r11.zbb
                boolean r3 = r11.zbc
                boolean r4 = r11.zbd
                android.accounts.Account r5 = r11.zbe
                java.lang.String r6 = r11.zbf
                java.lang.String r7 = r11.zbg
                boolean r8 = r11.zbh
                android.os.Bundle r9 = r11.zbi
                r0 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r10
        }

        public com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder filterByHostedDomain(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
                r0.zbf = r1
                return r0
        }

        public com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder requestOfflineAccess(java.lang.String r2) {
                r1 = this;
                r0 = 0
                r1.requestOfflineAccess(r2, r0)
                return r1
        }

        public com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder requestOfflineAccess(java.lang.String r1, boolean r2) {
                r0 = this;
                r0.zbc(r1)
                r0.zbb = r1
                r1 = 1
                r0.zbc = r1
                r0.zbh = r2
                return r0
        }

        public com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder setAccount(android.accounts.Account r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                android.accounts.Account r1 = (android.accounts.Account) r1
                r0.zbe = r1
                return r0
        }

        public com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder setRequestedScopes(java.util.List<com.google.android.gms.common.api.Scope> r3) {
                r2 = this;
                r0 = 0
                if (r3 == 0) goto La
                boolean r1 = r3.isEmpty()
                if (r1 != 0) goto La
                r0 = 1
            La:
                java.lang.String r1 = "requestedScopes cannot be null or empty"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
                r2.zba = r3
                return r2
        }

        @com.google.android.gms.common.internal.ShowFirstParty
        public final com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder zba(java.lang.String r1) {
                r0 = this;
                r0.zbc(r1)
                r0.zbb = r1
                r1 = 1
                r0.zbd = r1
                return r0
        }

        public final com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder zbb(java.lang.String r1) {
                r0 = this;
                r0.zbg = r1
                return r0
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
    public enum ResourceParameter extends java.lang.Enum<com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter> {
        public static final com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter ACCOUNT_SELECTION_STATE = null;
        public static final com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter ACCOUNT_SELECTION_TOKEN = null;
        private static final /* synthetic */ com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter[] zbb = null;
        final java.lang.String zba;

        static {
                com.google.android.gms.auth.api.identity.AuthorizationRequest$ResourceParameter r0 = new com.google.android.gms.auth.api.identity.AuthorizationRequest$ResourceParameter
                java.lang.String r1 = "ACCOUNT_SELECTION_TOKEN"
                r2 = 0
                java.lang.String r3 = "account_selection_token"
                r0.<init>(r1, r2, r3)
                com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter.ACCOUNT_SELECTION_TOKEN = r0
                com.google.android.gms.auth.api.identity.AuthorizationRequest$ResourceParameter r1 = new com.google.android.gms.auth.api.identity.AuthorizationRequest$ResourceParameter
                java.lang.String r3 = "ACCOUNT_SELECTION_STATE"
                r4 = 1
                java.lang.String r5 = "account_selection_state"
                r1.<init>(r3, r4, r5)
                com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter.ACCOUNT_SELECTION_STATE = r1
                r3 = 2
                com.google.android.gms.auth.api.identity.AuthorizationRequest$ResourceParameter[] r3 = new com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter.zbb = r3
                return
        }

        ResourceParameter(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.zba = r3
                return
        }

        public static com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.gms.auth.api.identity.AuthorizationRequest$ResourceParameter> r0 = com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.gms.auth.api.identity.AuthorizationRequest$ResourceParameter r1 = (com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter) r1
                return r1
        }

        public static com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter[] values() {
                com.google.android.gms.auth.api.identity.AuthorizationRequest$ResourceParameter[] r0 = com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter.zbb
                java.lang.Object r0 = r0.clone()
                com.google.android.gms.auth.api.identity.AuthorizationRequest$ResourceParameter[] r0 = (com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter[]) r0
                return r0
        }
    }

    static {
            com.google.android.gms.auth.api.identity.zbd r0 = new com.google.android.gms.auth.api.identity.zbd
            r0.<init>()
            com.google.android.gms.auth.api.identity.AuthorizationRequest.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    AuthorizationRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.util.List r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) android.accounts.Account r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.lang.String r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) boolean r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) android.os.Bundle r11) {
            r2 = this;
            r2.<init>()
            r0 = 0
            if (r3 == 0) goto Ld
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto Ld
            r0 = 1
        Ld:
            java.lang.String r1 = "requestedScopes cannot be null or empty"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            r2.zba = r3
            r2.zbb = r4
            r2.zbc = r5
            r2.zbd = r6
            r2.zbe = r7
            r2.zbf = r8
            r2.zbg = r9
            r2.zbh = r10
            r2.zbi = r11
            return
    }

    public static com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder builder() {
            com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder r0 = new com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder
            r0.<init>()
            return r0
    }

    public static com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder zba(com.google.android.gms.auth.api.identity.AuthorizationRequest r10) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)
            com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder r0 = builder()
            java.util.List r1 = r10.getRequestedScopes()
            r0.setRequestedScopes(r1)
            android.os.Bundle r1 = r10.getResourceParameters()
            if (r1 == 0) goto L4b
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r1.getString(r3)
            com.google.android.gms.auth.api.identity.AuthorizationRequest$ResourceParameter[] r5 = com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter.values()
            int r6 = r5.length
            r7 = 0
        L32:
            if (r7 >= r6) goto L42
            r8 = r5[r7]
            java.lang.String r9 = r8.zba
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L3f
            goto L43
        L3f:
            int r7 = r7 + 1
            goto L32
        L42:
            r8 = 0
        L43:
            if (r4 == 0) goto L1c
            if (r8 == 0) goto L1c
            r0.addResourceParameter(r8, r4)
            goto L1c
        L4b:
            boolean r1 = r10.isForceCodeForRefreshToken()
            java.lang.String r2 = r10.zbg
            java.lang.String r3 = r10.getHostedDomain()
            android.accounts.Account r4 = r10.getAccount()
            java.lang.String r5 = r10.getServerClientId()
            if (r2 == 0) goto L62
            r0.zbb(r2)
        L62:
            if (r3 == 0) goto L67
            r0.filterByHostedDomain(r3)
        L67:
            if (r4 == 0) goto L6c
            r0.setAccount(r4)
        L6c:
            boolean r2 = r10.zbd
            if (r2 == 0) goto L75
            if (r5 == 0) goto L75
            r0.zba(r5)
        L75:
            boolean r10 = r10.isOfflineAccessRequested()
            if (r10 == 0) goto L80
            if (r5 == 0) goto L80
            r0.requestOfflineAccess(r5, r1)
        L80:
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.gms.auth.api.identity.AuthorizationRequest
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.auth.api.identity.AuthorizationRequest r6 = (com.google.android.gms.auth.api.identity.AuthorizationRequest) r6
            java.util.List r0 = r5.zba
            int r0 = r0.size()
            java.util.List r2 = r6.zba
            int r2 = r2.size()
            if (r0 != r2) goto La1
            java.util.List r0 = r5.zba
            java.util.List r2 = r6.zba
            boolean r0 = r0.containsAll(r2)
            if (r0 != 0) goto L22
            goto La1
        L22:
            android.os.Bundle r0 = r6.zbi
            android.os.Bundle r2 = r5.zbi
            if (r2 != 0) goto L2b
            if (r0 != 0) goto L30
            r0 = 0
        L2b:
            if (r2 == 0) goto L31
            if (r0 == 0) goto L30
            goto L31
        L30:
            return r1
        L31:
            if (r2 == 0) goto L65
            int r2 = r2.size()
            int r3 = r0.size()
            if (r2 == r3) goto L3e
            return r1
        L3e:
            android.os.Bundle r2 = r5.zbi
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L48:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L65
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = r5.zbi
            java.lang.String r4 = r4.getString(r3)
            java.lang.String r3 = r0.getString(r3)
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r4, r3)
            if (r3 != 0) goto L48
            return r1
        L65:
            boolean r0 = r5.zbc
            boolean r2 = r6.zbc
            if (r0 != r2) goto La1
            boolean r0 = r5.zbh
            boolean r2 = r6.zbh
            if (r0 != r2) goto La1
            boolean r0 = r5.zbd
            boolean r2 = r6.zbd
            if (r0 != r2) goto La1
            java.lang.String r0 = r5.zbb
            java.lang.String r2 = r6.zbb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto La1
            android.accounts.Account r0 = r5.zbe
            android.accounts.Account r2 = r6.zbe
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto La1
            java.lang.String r0 = r5.zbf
            java.lang.String r2 = r6.zbf
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto La1
            java.lang.String r0 = r5.zbg
            java.lang.String r6 = r6.zbg
            boolean r6 = com.google.android.gms.common.internal.Objects.equal(r0, r6)
            if (r6 == 0) goto La1
            r6 = 1
            return r6
        La1:
            return r1
    }

    public android.accounts.Account getAccount() {
            r1 = this;
            android.accounts.Account r0 = r1.zbe
            return r0
    }

    public java.lang.String getHostedDomain() {
            r1 = this;
            java.lang.String r0 = r1.zbf
            return r0
    }

    public java.util.List<com.google.android.gms.common.api.Scope> getRequestedScopes() {
            r1 = this;
            java.util.List r0 = r1.zba
            return r0
    }

    public java.lang.String getResourceParameter(com.google.android.gms.auth.api.identity.AuthorizationRequest.ResourceParameter r2) {
            r1 = this;
            android.os.Bundle r0 = r1.zbi
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r2 = r2.zba
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    public android.os.Bundle getResourceParameters() {
            r1 = this;
            android.os.Bundle r0 = r1.zbi
            return r0
    }

    public java.lang.String getServerClientId() {
            r1 = this;
            java.lang.String r0 = r1.zbb
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.util.List r0 = r3.zba
            r1 = 9
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = r3.zbb
            r2 = 1
            r1[r2] = r0
            boolean r0 = r3.zbc
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2 = 2
            r1[r2] = r0
            boolean r0 = r3.zbh
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2 = 3
            r1[r2] = r0
            boolean r0 = r3.zbd
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2 = 4
            r1[r2] = r0
            android.accounts.Account r0 = r3.zbe
            r2 = 5
            r1[r2] = r0
            java.lang.String r0 = r3.zbf
            r2 = 6
            r1[r2] = r0
            java.lang.String r0 = r3.zbg
            r2 = 7
            r1[r2] = r0
            android.os.Bundle r0 = r3.zbi
            r2 = 8
            r1[r2] = r0
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }

    public boolean isForceCodeForRefreshToken() {
            r1 = this;
            boolean r0 = r1.zbh
            return r0
    }

    public boolean isOfflineAccessRequested() {
            r1 = this;
            boolean r0 = r1.zbc
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            java.util.List r1 = r4.getRequestedScopes()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r2, r1, r3)
            java.lang.String r1 = r4.getServerClientId()
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            boolean r1 = r4.isOfflineAccessRequested()
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r2, r1)
            boolean r1 = r4.zbd
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r2, r1)
            android.accounts.Account r1 = r4.getAccount()
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r6 = r4.getHostedDomain()
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            java.lang.String r6 = r4.zbg
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            boolean r6 = r4.isForceCodeForRefreshToken()
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            android.os.Bundle r6 = r4.getResourceParameters()
            r1 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r5, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
