package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "DisconnectRequestCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzad extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzad> CREATOR = null;

    static {
            com.google.android.gms.internal.drive.zzae r0 = new com.google.android.gms.internal.drive.zzae
            r0.<init>()
            com.google.android.gms.internal.drive.zzad.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    @com.google.android.gms.common.util.VisibleForTesting
    public zzad() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r1, r2)
            return
    }
}
