package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public abstract class zzda extends com.google.android.gms.internal.measurement.zzbn implements com.google.android.gms.internal.measurement.zzdb {
    public zzda() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r2 = 2
            if (r1 != r2) goto L8
            r0.zze()
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }
}
