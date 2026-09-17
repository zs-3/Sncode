package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "BeginSignInResultCreator")
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class BeginSignInResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInResult> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final android.app.PendingIntent zba;

    static {
            com.google.android.gms.auth.api.identity.zbg r0 = new com.google.android.gms.auth.api.identity.zbg
            r0.<init>()
            com.google.android.gms.auth.api.identity.BeginSignInResult.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public BeginSignInResult(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) android.app.PendingIntent r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r0.zba = r1
            return
    }

    public android.app.PendingIntent getPendingIntent() {
            r1 = this;
            android.app.PendingIntent r0 = r1.zba
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            android.app.PendingIntent r1 = r4.getPendingIntent()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
