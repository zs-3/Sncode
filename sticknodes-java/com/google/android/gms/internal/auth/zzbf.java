package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public abstract class zzbf extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzbg {
    public zzbf() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.internal.IAuthCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L13
            r0 = 2
            if (r2 == r0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.auth.zzc.zzb(r3)
            r1.zzc(r2)
            goto L21
        L13:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.proxy.ProxyResponse> r2 = com.google.android.gms.auth.api.proxy.ProxyResponse.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.auth.zzc.zza(r3, r2)
            com.google.android.gms.auth.api.proxy.ProxyResponse r2 = (com.google.android.gms.auth.api.proxy.ProxyResponse) r2
            com.google.android.gms.internal.auth.zzc.zzb(r3)
            r1.zzb(r2)
        L21:
            r4.writeNoException()
            return r5
    }
}
