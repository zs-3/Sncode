package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public abstract class zzd extends com.google.android.gms.internal.fido.zzb implements com.google.android.gms.internal.fido.zze {
    public zzd() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.fido.fido2.api.IBooleanCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.fido.zzb
    protected final boolean zza(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
            r2 = this;
            r6 = 0
            r0 = 1
            if (r3 == r0) goto L17
            r1 = 2
            if (r3 == r1) goto L8
            return r6
        L8:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r3 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.fido.zzc.zza(r4, r3)
            com.google.android.gms.common.api.Status r3 = (com.google.android.gms.common.api.Status) r3
            com.google.android.gms.internal.fido.zzc.zzc(r4)
            r2.zzc(r3)
            goto L26
        L17:
            int r3 = com.google.android.gms.internal.fido.zzc.zza
            int r3 = r4.readInt()
            com.google.android.gms.internal.fido.zzc.zzc(r4)
            if (r3 == 0) goto L23
            r6 = 1
        L23:
            r2.zzb(r6)
        L26:
            r5.writeNoException()
            return r0
    }
}
