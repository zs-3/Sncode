package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public abstract class zzl extends com.google.android.gms.internal.fido.zzb implements com.google.android.gms.internal.fido.zzm {
    public zzl() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.fido.zzb
    protected final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r3 = 1
            if (r1 != r3) goto L1a
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.fido.zzc.zza(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            android.os.Parcelable$Creator r4 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.fido.zzc.zza(r2, r4)
            android.app.PendingIntent r4 = (android.app.PendingIntent) r4
            com.google.android.gms.internal.fido.zzc.zzc(r2)
            r0.zzb(r1, r4)
            return r3
        L1a:
            r1 = 0
            return r1
    }
}
