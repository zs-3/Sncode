package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public abstract class zzf extends com.google.android.gms.internal.fido.zzb implements com.google.android.gms.internal.fido.zzg {
    public zzf() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.fido.fido2.api.ICredentialListCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.fido.zzb
    protected final boolean zza(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L17
            r0 = 2
            if (r2 == r0) goto L8
            r2 = 0
            return r2
        L8:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r2 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.fido.zzc.zza(r3, r2)
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            com.google.android.gms.internal.fido.zzc.zzc(r3)
            r1.zzc(r2)
            goto L21
        L17:
            java.util.ArrayList r2 = com.google.android.gms.internal.fido.zzc.zzb(r3)
            com.google.android.gms.internal.fido.zzc.zzc(r3)
            r1.zzb(r2)
        L21:
            r4.writeNoException()
            return r5
    }
}
