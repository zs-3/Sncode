package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AuthorizationResultCreator")
/* loaded from: classes.dex */
public final class AuthorizationResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.AuthorizationResult> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getServerAuthCode", id = 1)
    private final java.lang.String zba;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAccessToken", id = 2)
    private final java.lang.String zbb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIdToken", id = 3)
    private final java.lang.String zbc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGrantedScopes", id = 4)
    private final java.util.List zbd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "toGoogleSignInAccount", id = 5)
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zbe;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPendingIntent", id = 6)
    private final android.app.PendingIntent zbf;

    static {
            com.google.android.gms.auth.api.identity.zbe r0 = new com.google.android.gms.auth.api.identity.zbe
            r0.<init>()
            com.google.android.gms.auth.api.identity.AuthorizationResult.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public AuthorizationResult(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.util.List<java.lang.String> r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) com.google.android.gms.auth.api.signin.GoogleSignInAccount r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) android.app.PendingIntent r6) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            r0.zbb = r2
            r0.zbc = r3
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.util.List r1 = (java.util.List) r1
            r0.zbd = r1
            r0.zbf = r6
            r0.zbe = r5
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.auth.api.identity.AuthorizationResult
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.auth.api.identity.AuthorizationResult r4 = (com.google.android.gms.auth.api.identity.AuthorizationResult) r4
            java.lang.String r0 = r3.zba
            java.lang.String r2 = r4.zba
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L46
            java.lang.String r0 = r3.zbb
            java.lang.String r2 = r4.zbb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L46
            java.lang.String r0 = r3.zbc
            java.lang.String r2 = r4.zbc
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L46
            java.util.List r0 = r3.zbd
            java.util.List r2 = r4.zbd
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L46
            android.app.PendingIntent r0 = r3.zbf
            android.app.PendingIntent r2 = r4.zbf
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L46
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r3.zbe
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r4 = r4.zbe
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L46
            r4 = 1
            return r4
        L46:
            return r1
    }

    public java.lang.String getAccessToken() {
            r1 = this;
            java.lang.String r0 = r1.zbb
            return r0
    }

    public java.util.List<java.lang.String> getGrantedScopes() {
            r1 = this;
            java.util.List r0 = r1.zbd
            return r0
    }

    public android.app.PendingIntent getPendingIntent() {
            r1 = this;
            android.app.PendingIntent r0 = r1.zbf
            return r0
    }

    public java.lang.String getServerAuthCode() {
            r1 = this;
            java.lang.String r0 = r1.zba
            return r0
    }

    public boolean hasResolution() {
            r1 = this;
            android.app.PendingIntent r0 = r1.zbf
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zba
            r1 = 6
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
            android.app.PendingIntent r0 = r3.zbf
            r2 = 4
            r1[r2] = r0
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r3.zbe
            r2 = 5
            r1[r2] = r0
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount toGoogleSignInAccount() {
            r1 = this;
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r1.zbe
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            java.lang.String r1 = r4.getServerAuthCode()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String r1 = r4.getAccessToken()
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String r1 = r4.zbc
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.util.List r1 = r4.getGrantedScopes()
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r5, r2, r1, r3)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r4.toGoogleSignInAccount()
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            android.app.PendingIntent r1 = r4.getPendingIntent()
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
