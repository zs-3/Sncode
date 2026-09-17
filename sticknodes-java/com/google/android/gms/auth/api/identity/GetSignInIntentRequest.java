package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GetSignInIntentRequestCreator")
@java.lang.Deprecated
/* loaded from: classes.dex */
public class GetSignInIntentRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.GetSignInIntentRequest> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getServerClientId", id = 1)
    private final java.lang.String zba;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getHostedDomainFilter", id = 2)
    private final java.lang.String zbb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSessionId", id = 3)
    private final java.lang.String zbc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getNonce", id = 4)
    private final java.lang.String zbd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "requestVerifiedPhoneNumber", id = 5)
    private final boolean zbe;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTheme", id = 6)
    private final int zbf;

    /* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
    public static final class Builder {
        private java.lang.String zba;
        private java.lang.String zbb;
        private java.lang.String zbc;
        private java.lang.String zbd;
        private boolean zbe;
        private int zbf;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.android.gms.auth.api.identity.GetSignInIntentRequest build() {
                r8 = this;
                com.google.android.gms.auth.api.identity.GetSignInIntentRequest r7 = new com.google.android.gms.auth.api.identity.GetSignInIntentRequest
                java.lang.String r1 = r8.zba
                java.lang.String r2 = r8.zbb
                java.lang.String r3 = r8.zbc
                java.lang.String r4 = r8.zbd
                boolean r5 = r8.zbe
                int r6 = r8.zbf
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        public com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder filterByHostedDomain(java.lang.String r1) {
                r0 = this;
                r0.zbb = r1
                return r0
        }

        public com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder setNonce(java.lang.String r1) {
                r0 = this;
                r0.zbd = r1
                return r0
        }

        @java.lang.Deprecated
        public com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder setRequestVerifiedPhoneNumber(boolean r1) {
                r0 = this;
                r0.zbe = r1
                return r0
        }

        public com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder setServerClientId(java.lang.String r1) {
                r0 = this;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                r0.zba = r1
                return r0
        }

        public final com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder zba(java.lang.String r1) {
                r0 = this;
                r0.zbc = r1
                return r0
        }

        public final com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder zbb(int r1) {
                r0 = this;
                r0.zbf = r1
                return r0
        }
    }

    static {
            com.google.android.gms.auth.api.identity.zbk r0 = new com.google.android.gms.auth.api.identity.zbk
            r0.<init>()
            com.google.android.gms.auth.api.identity.GetSignInIntentRequest.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    GetSignInIntentRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) int r6) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zba = r1
            r0.zbb = r2
            r0.zbc = r3
            r0.zbd = r4
            r0.zbe = r5
            r0.zbf = r6
            return
    }

    public static com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder builder() {
            com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder r0 = new com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder
            r0.<init>()
            return r0
    }

    public static com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder zba(com.google.android.gms.auth.api.identity.GetSignInIntentRequest r2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder r0 = builder()
            java.lang.String r1 = r2.getServerClientId()
            r0.setServerClientId(r1)
            java.lang.String r1 = r2.getNonce()
            r0.setNonce(r1)
            java.lang.String r1 = r2.getHostedDomainFilter()
            r0.filterByHostedDomain(r1)
            boolean r1 = r2.zbe
            r0.setRequestVerifiedPhoneNumber(r1)
            int r1 = r2.zbf
            r0.zbb(r1)
            java.lang.String r2 = r2.zbc
            if (r2 == 0) goto L2d
            r0.zba(r2)
        L2d:
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.auth.api.identity.GetSignInIntentRequest
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.auth.api.identity.GetSignInIntentRequest r4 = (com.google.android.gms.auth.api.identity.GetSignInIntentRequest) r4
            java.lang.String r0 = r3.zba
            java.lang.String r2 = r4.zba
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L40
            java.lang.String r0 = r3.zbd
            java.lang.String r2 = r4.zbd
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L40
            java.lang.String r0 = r3.zbb
            java.lang.String r2 = r4.zbb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L40
            boolean r0 = r3.zbe
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r2 = r4.zbe
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L40
            int r0 = r3.zbf
            int r4 = r4.zbf
            if (r0 != r4) goto L40
            r4 = 1
            return r4
        L40:
            return r1
    }

    public java.lang.String getHostedDomainFilter() {
            r1 = this;
            java.lang.String r0 = r1.zbb
            return r0
    }

    public java.lang.String getNonce() {
            r1 = this;
            java.lang.String r0 = r1.zbd
            return r0
    }

    public java.lang.String getServerClientId() {
            r1 = this;
            java.lang.String r0 = r1.zba
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zba
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = r3.zbb
            r2 = 1
            r1[r2] = r0
            java.lang.String r0 = r3.zbd
            r2 = 2
            r1[r2] = r0
            boolean r0 = r3.zbe
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2 = 3
            r1[r2] = r0
            int r0 = r3.zbf
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 4
            r1[r2] = r0
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }

    @java.lang.Deprecated
    public boolean requestVerifiedPhoneNumber() {
            r1 = this;
            boolean r0 = r1.zbe
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.getServerClientId()
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.lang.String r0 = r3.getHostedDomainFilter()
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.lang.String r0 = r3.zbc
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.lang.String r0 = r3.getNonce()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            boolean r0 = r3.requestVerifiedPhoneNumber()
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            int r0 = r3.zbf
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
