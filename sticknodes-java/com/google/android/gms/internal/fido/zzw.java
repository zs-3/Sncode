package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public final class zzw extends com.google.android.gms.internal.fido.zza {
    zzw(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService"
            r1.<init>(r2, r0)
            return
    }

    public final void zzc(com.google.android.gms.internal.fido.zzv r3, com.google.android.gms.fido.u2f.api.common.RegisterRequestParams r4) throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            int r1 = com.google.android.gms.internal.fido.zzc.zza
            r0.writeStrongBinder(r3)
            com.google.android.gms.internal.fido.zzc.zzd(r0, r4)
            r3 = 1
            r2.zzb(r3, r0)
            return
    }

    public final void zzd(com.google.android.gms.internal.fido.zzv r3, com.google.android.gms.fido.u2f.api.common.SignRequestParams r4) throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            int r1 = com.google.android.gms.internal.fido.zzc.zza
            r0.writeStrongBinder(r3)
            com.google.android.gms.internal.fido.zzc.zzd(r0, r4)
            r3 = 2
            r2.zzb(r3, r0)
            return
    }
}
