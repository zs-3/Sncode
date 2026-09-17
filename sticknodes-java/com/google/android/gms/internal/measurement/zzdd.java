package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public abstract class zzdd extends com.google.android.gms.internal.measurement.zzbn implements com.google.android.gms.internal.measurement.zzde {
    public zzdd() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) throws android.os.RemoteException {
            r6 = this;
            r10 = 1
            if (r7 == r10) goto L13
            r8 = 2
            if (r7 == r8) goto L8
            r7 = 0
            return r7
        L8:
            int r7 = r6.zze()
            r9.writeNoException()
            r9.writeInt(r7)
            goto L32
        L13:
            java.lang.String r1 = r8.readString()
            java.lang.String r2 = r8.readString()
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.zzbo.zza(r8, r7)
            r3 = r7
            android.os.Bundle r3 = (android.os.Bundle) r3
            long r4 = r8.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r8)
            r0 = r6
            r0.zzf(r1, r2, r3, r4)
            r9.writeNoException()
        L32:
            return r10
    }
}
