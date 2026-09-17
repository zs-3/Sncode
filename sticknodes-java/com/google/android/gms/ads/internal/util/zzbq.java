package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbq extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.util.zzbr {
    public zzbq() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.util.IWorkManagerUtil"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L3b
            r0 = 2
            if (r3 == r0) goto L29
            r0 = 3
            if (r3 == r0) goto Lb
            r3 = 0
            return r3
        Lb:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.offline.buffering.zza> r0 = com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r4, r0)
            com.google.android.gms.ads.internal.offline.buffering.zza r0 = (com.google.android.gms.ads.internal.offline.buffering.zza) r0
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            boolean r3 = r2.zzg(r3, r0)
            r5.writeNoException()
            r5.writeInt(r3)
            goto L58
        L29:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zze(r3)
            r5.writeNoException()
            goto L58
        L3b:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            java.lang.String r0 = r4.readString()
            java.lang.String r1 = r4.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            boolean r3 = r2.zzf(r3, r0, r1)
            r5.writeNoException()
            r5.writeInt(r3)
        L58:
            return r6
    }
}
