package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SignInConfigurationCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class SignInConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.internal.SignInConfiguration> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getConsumerPkgName", id = 2)
    private final java.lang.String zba;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGoogleConfig", id = 5)
    private final com.google.android.gms.auth.api.signin.GoogleSignInOptions zbb;

    static {
            com.google.android.gms.auth.api.signin.internal.zbu r0 = new com.google.android.gms.auth.api.signin.internal.zbu
            r0.<init>()
            com.google.android.gms.auth.api.signin.internal.SignInConfiguration.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public SignInConfiguration(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) com.google.android.gms.auth.api.signin.GoogleSignInOptions r2) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            r0.zba = r1
            r0.zbb = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.auth.api.signin.internal.SignInConfiguration
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.auth.api.signin.internal.SignInConfiguration r4 = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) r4
            java.lang.String r0 = r3.zba
            java.lang.String r2 = r4.zba
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L24
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r3.zbb
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = r4.zbb
            if (r0 != 0) goto L1b
            if (r4 != 0) goto L24
            goto L22
        L1b:
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L22
            goto L24
        L22:
            r4 = 1
            return r4
        L24:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            com.google.android.gms.auth.api.signin.internal.HashAccumulator r0 = new com.google.android.gms.auth.api.signin.internal.HashAccumulator
            r0.<init>()
            java.lang.String r1 = r2.zba
            com.google.android.gms.auth.api.signin.internal.HashAccumulator r0 = r0.addObject(r1)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = r2.zbb
            com.google.android.gms.auth.api.signin.internal.HashAccumulator r0 = r0.addObject(r1)
            int r0 = r0.hash()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            java.lang.String r0 = r4.zba
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r4.zbb
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions zba() {
            r1 = this;
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r1.zbb
            return r0
    }
}
