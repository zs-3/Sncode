package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public abstract class zzet extends com.google.android.gms.internal.drive.zzb implements com.google.android.gms.internal.drive.zzes {
    public zzet() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.drive.internal.IEventCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzb
    protected final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r4 = 1
            if (r1 != r4) goto L12
            android.os.Parcelable$Creator<com.google.android.gms.internal.drive.zzfp> r1 = com.google.android.gms.internal.drive.zzfp.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.drive.zzc.zza(r2, r1)
            com.google.android.gms.internal.drive.zzfp r1 = (com.google.android.gms.internal.drive.zzfp) r1
            r0.zzc(r1)
            r3.writeNoException()
            return r4
        L12:
            r1 = 0
            return r1
    }
}
