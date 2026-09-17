package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
public final class zzx extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.ICancelToken {
    zzx(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.ICancelToken"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            r2.zzD(r1, r0)
            return
    }
}
