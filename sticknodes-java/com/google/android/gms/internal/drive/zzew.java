package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzew extends com.google.android.gms.internal.drive.zza implements com.google.android.gms.internal.drive.zzeu {
    zzew(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.drive.internal.IEventReleaseCallback"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzeu
    public final void zza(boolean r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.drive.zzc.writeBoolean(r0, r2)
            r2 = 1
            r1.zzc(r2, r0)
            return
    }
}
