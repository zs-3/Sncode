package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SignInCredentialCreator")
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class SignInCredential extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.SignInCredential> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getId", id = 1)
    private final java.lang.String zba;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDisplayName", id = 2)
    private final java.lang.String zbb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGivenName", id = 3)
    private final java.lang.String zbc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getFamilyName", id = 4)
    private final java.lang.String zbd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getProfilePictureUri", id = 5)
    private final android.net.Uri zbe;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPassword", id = 6)
    private final java.lang.String zbf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGoogleIdToken", id = 7)
    private final java.lang.String zbg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPhoneNumber", id = 8)
    private final java.lang.String zbh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPublicKeyCredential", id = 9)
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredential zbi;

    static {
            com.google.android.gms.auth.api.identity.zbt r0 = new com.google.android.gms.auth.api.identity.zbt
            r0.<init>()
            com.google.android.gms.auth.api.identity.SignInCredential.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    SignInCredential(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) android.net.Uri r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.lang.String r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) java.lang.String r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r9) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.zba = r1
            r0.zbb = r2
            r0.zbc = r3
            r0.zbd = r4
            r0.zbe = r5
            r0.zbf = r6
            r0.zbg = r7
            r0.zbh = r8
            r0.zbi = r9
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.auth.api.identity.SignInCredential
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.auth.api.identity.SignInCredential r4 = (com.google.android.gms.auth.api.identity.SignInCredential) r4
            java.lang.String r0 = r3.zba
            java.lang.String r2 = r4.zba
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L64
            java.lang.String r0 = r3.zbb
            java.lang.String r2 = r4.zbb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L64
            java.lang.String r0 = r3.zbc
            java.lang.String r2 = r4.zbc
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L64
            java.lang.String r0 = r3.zbd
            java.lang.String r2 = r4.zbd
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L64
            android.net.Uri r0 = r3.zbe
            android.net.Uri r2 = r4.zbe
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L64
            java.lang.String r0 = r3.zbf
            java.lang.String r2 = r4.zbf
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L64
            java.lang.String r0 = r3.zbg
            java.lang.String r2 = r4.zbg
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L64
            java.lang.String r0 = r3.zbh
            java.lang.String r2 = r4.zbh
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L64
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r0 = r3.zbi
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r4 = r4.zbi
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L64
            r4 = 1
            return r4
        L64:
            return r1
    }

    public java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.zbb
            return r0
    }

    public java.lang.String getFamilyName() {
            r1 = this;
            java.lang.String r0 = r1.zbd
            return r0
    }

    public java.lang.String getGivenName() {
            r1 = this;
            java.lang.String r0 = r1.zbc
            return r0
    }

    public java.lang.String getGoogleIdToken() {
            r1 = this;
            java.lang.String r0 = r1.zbg
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.zba
            return r0
    }

    public java.lang.String getPassword() {
            r1 = this;
            java.lang.String r0 = r1.zbf
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getPhoneNumber() {
            r1 = this;
            java.lang.String r0 = r1.zbh
            return r0
    }

    public android.net.Uri getProfilePictureUri() {
            r1 = this;
            android.net.Uri r0 = r1.zbe
            return r0
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential getPublicKeyCredential() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r0 = r1.zbi
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zba
            r1 = 9
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = r3.zbb
            r2 = 1
            r1[r2] = r0
            java.lang.String r0 = r3.zbc
            r2 = 2
            r1[r2] = r0
            java.lang.String r0 = r3.zbd
            r2 = 3
            r1[r2] = r0
            android.net.Uri r0 = r3.zbe
            r2 = 4
            r1[r2] = r0
            java.lang.String r0 = r3.zbf
            r2 = 5
            r1[r2] = r0
            java.lang.String r0 = r3.zbg
            r2 = 6
            r1[r2] = r0
            java.lang.String r0 = r3.zbh
            r2 = 7
            r1[r2] = r0
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r0 = r3.zbi
            r2 = 8
            r1[r2] = r0
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            java.lang.String r1 = r4.getId()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String r1 = r4.getDisplayName()
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String r1 = r4.getGivenName()
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String r1 = r4.getFamilyName()
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            android.net.Uri r1 = r4.getProfilePictureUri()
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r1 = r4.getPassword()
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String r1 = r4.getGoogleIdToken()
            r2 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String r1 = r4.getPhoneNumber()
            r2 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r1 = r4.getPublicKeyCredential()
            r2 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
