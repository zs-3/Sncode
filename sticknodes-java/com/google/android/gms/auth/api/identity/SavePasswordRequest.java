package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SavePasswordRequestCreator")
@java.lang.Deprecated
/* loaded from: classes.dex */
public class SavePasswordRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.SavePasswordRequest> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSignInPassword", id = 1)
    private final com.google.android.gms.auth.api.identity.SignInPassword zba;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSessionId", id = 2)
    private final java.lang.String zbb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTheme", id = 3)
    private final int zbc;

    /* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
    @java.lang.Deprecated
    public static final class Builder {
        private com.google.android.gms.auth.api.identity.SignInPassword zba;
        private java.lang.String zbb;
        private int zbc;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.android.gms.auth.api.identity.SavePasswordRequest build() {
                r4 = this;
                com.google.android.gms.auth.api.identity.SavePasswordRequest r0 = new com.google.android.gms.auth.api.identity.SavePasswordRequest
                com.google.android.gms.auth.api.identity.SignInPassword r1 = r4.zba
                java.lang.String r2 = r4.zbb
                int r3 = r4.zbc
                r0.<init>(r1, r2, r3)
                return r0
        }

        public com.google.android.gms.auth.api.identity.SavePasswordRequest.Builder setSignInPassword(com.google.android.gms.auth.api.identity.SignInPassword r1) {
                r0 = this;
                r0.zba = r1
                return r0
        }

        public final com.google.android.gms.auth.api.identity.SavePasswordRequest.Builder zba(java.lang.String r1) {
                r0 = this;
                r0.zbb = r1
                return r0
        }

        public final com.google.android.gms.auth.api.identity.SavePasswordRequest.Builder zbb(int r1) {
                r0 = this;
                r0.zbc = r1
                return r0
        }
    }

    static {
            com.google.android.gms.auth.api.identity.zbr r0 = new com.google.android.gms.auth.api.identity.zbr
            r0.<init>()
            com.google.android.gms.auth.api.identity.SavePasswordRequest.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    SavePasswordRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.auth.api.identity.SignInPassword r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.auth.api.identity.SignInPassword r1 = (com.google.android.gms.auth.api.identity.SignInPassword) r1
            r0.zba = r1
            r0.zbb = r2
            r0.zbc = r3
            return
    }

    public static com.google.android.gms.auth.api.identity.SavePasswordRequest.Builder builder() {
            com.google.android.gms.auth.api.identity.SavePasswordRequest$Builder r0 = new com.google.android.gms.auth.api.identity.SavePasswordRequest$Builder
            r0.<init>()
            return r0
    }

    public static com.google.android.gms.auth.api.identity.SavePasswordRequest.Builder zba(com.google.android.gms.auth.api.identity.SavePasswordRequest r2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.auth.api.identity.SavePasswordRequest$Builder r0 = builder()
            com.google.android.gms.auth.api.identity.SignInPassword r1 = r2.getSignInPassword()
            r0.setSignInPassword(r1)
            int r1 = r2.zbc
            r0.zbb(r1)
            java.lang.String r2 = r2.zbb
            if (r2 == 0) goto L1a
            r0.zba(r2)
        L1a:
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.auth.api.identity.SavePasswordRequest
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.auth.api.identity.SavePasswordRequest r4 = (com.google.android.gms.auth.api.identity.SavePasswordRequest) r4
            com.google.android.gms.auth.api.identity.SignInPassword r0 = r3.zba
            com.google.android.gms.auth.api.identity.SignInPassword r2 = r4.zba
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L24
            java.lang.String r0 = r3.zbb
            java.lang.String r2 = r4.zbb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L24
            int r0 = r3.zbc
            int r4 = r4.zbc
            if (r0 != r4) goto L24
            r4 = 1
            return r4
        L24:
            return r1
    }

    public com.google.android.gms.auth.api.identity.SignInPassword getSignInPassword() {
            r1 = this;
            com.google.android.gms.auth.api.identity.SignInPassword r0 = r1.zba
            return r0
    }

    public int hashCode() {
            r3 = this;
            com.google.android.gms.auth.api.identity.SignInPassword r0 = r3.zba
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = r3.zbb
            r2 = 1
            r1[r2] = r0
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.auth.api.identity.SignInPassword r1 = r4.getSignInPassword()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r6 = r4.zbb
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            int r6 = r4.zbc
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
