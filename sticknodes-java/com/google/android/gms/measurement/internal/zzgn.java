package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public abstract class zzgn extends com.google.android.gms.internal.measurement.zzbn implements com.google.android.gms.measurement.internal.zzgo {
    public zzgn() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.internal.ITriggerUrisCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r3 = 2
            if (r1 != r3) goto L11
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzov> r1 = com.google.android.gms.measurement.internal.zzov.CREATOR
            java.util.ArrayList r1 = r2.createTypedArrayList(r1)
            com.google.android.gms.internal.measurement.zzbo.zzc(r2)
            r0.zze(r1)
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }
}
