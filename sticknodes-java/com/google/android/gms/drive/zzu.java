package com.google.android.gms.drive;

/* loaded from: classes.dex */
public abstract class zzu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    private volatile transient boolean zzbt;

    public zzu() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzbt = r0
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            boolean r0 = r2.zzbt
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            r2.zzbt = r1
            r2.zza(r3, r4)
            return
    }

    protected abstract void zza(android.os.Parcel r1, int r2);
}
