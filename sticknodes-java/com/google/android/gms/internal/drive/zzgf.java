package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "OnStartStreamSessionCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzgf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgf> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final android.os.ParcelFileDescriptor zzin;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final android.os.IBinder zzio;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final java.lang.String zzm;

    static {
            com.google.android.gms.internal.drive.zzgg r0 = new com.google.android.gms.internal.drive.zzgg
            r0.<init>()
            com.google.android.gms.internal.drive.zzgf.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzgf(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.ParcelFileDescriptor r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.os.IBinder r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.zzin = r1
            r0.zzio = r2
            r0.zzm = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = r6 | 1
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            android.os.ParcelFileDescriptor r1 = r4.zzin
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            android.os.IBinder r6 = r4.zzio
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r5, r1, r6, r3)
            java.lang.String r6 = r4.zzm
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
