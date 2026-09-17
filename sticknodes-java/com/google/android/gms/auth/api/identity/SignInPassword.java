package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SignInPasswordCreator")
@java.lang.Deprecated
/* loaded from: classes.dex */
public class SignInPassword extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.SignInPassword> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getId", id = 1)
    private final java.lang.String zba;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPassword", id = 2)
    private final java.lang.String zbb;

    static {
            com.google.android.gms.auth.api.identity.zbv r0 = new com.google.android.gms.auth.api.identity.zbv
            r0.<init>()
            com.google.android.gms.auth.api.identity.SignInPassword.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public SignInPassword(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Account identifier cannot be null"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "Account identifier cannot be empty"
            java.lang.String r2 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2, r0)
            r1.zba = r2
            java.lang.String r2 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            r1.zbb = r2
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.auth.api.identity.SignInPassword
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.auth.api.identity.SignInPassword r4 = (com.google.android.gms.auth.api.identity.SignInPassword) r4
            java.lang.String r0 = r3.zba
            java.lang.String r2 = r4.zba
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L1e
            java.lang.String r0 = r3.zbb
            java.lang.String r4 = r4.zbb
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.zba
            return r0
    }

    public java.lang.String getPassword() {
            r1 = this;
            java.lang.String r0 = r1.zbb
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zba
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
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.getId()
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.lang.String r0 = r3.getPassword()
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
