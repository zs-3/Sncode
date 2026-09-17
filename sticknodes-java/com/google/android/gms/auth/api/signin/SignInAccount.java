package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SignInAccountCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class SignInAccount extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.SignInAccount> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "", id = 4)
    @java.lang.Deprecated
    final java.lang.String zba;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "", id = 8)
    @java.lang.Deprecated
    final java.lang.String zbb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGoogleSignInAccount", id = 7)
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zbc;

    static {
            com.google.android.gms.auth.api.signin.zbc r0 = new com.google.android.gms.auth.api.signin.zbc
            r0.<init>()
            com.google.android.gms.auth.api.signin.SignInAccount.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    SignInAccount(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) com.google.android.gms.auth.api.signin.GoogleSignInAccount r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.zbc = r2
            java.lang.String r2 = "8.3 and 8.4 SDKs require non-null email"
            java.lang.String r1 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1, r2)
            r0.zba = r1
            java.lang.String r1 = "8.3 and 8.4 SDKs require non-null userId"
            java.lang.String r1 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3, r1)
            r0.zbb = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            java.lang.String r0 = r4.zba
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 4
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r4.zbc
            r2 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            java.lang.String r6 = r4.zbb
            r0 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r0, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount zba() {
            r1 = this;
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r1.zbc
            return r0
    }
}
