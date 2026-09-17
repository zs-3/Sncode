package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbte extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbtf {
    public zzbte() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.offline.IOfflineUtils"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbtf zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.offline.IOfflineUtils"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbtf
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbtf r0 = (com.google.android.gms.internal.ads.zzbtf) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbtd r0 = new com.google.android.gms.internal.ads.zzbtd
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            switch(r2) {
                case 1: goto L5d;
                case 2: goto L46;
                case 3: goto L42;
                case 4: goto L33;
                case 5: goto L1c;
                case 6: goto L5;
                default: goto L3;
            }
        L3:
            r2 = 0
            return r2
        L5:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.offline.buffering.zza> r5 = com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.ads.zzayn.zza(r3, r5)
            com.google.android.gms.ads.internal.offline.buffering.zza r5 = (com.google.android.gms.ads.internal.offline.buffering.zza) r5
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzj(r2, r5)
            goto L6b
        L1c:
            java.lang.String[] r2 = r3.createStringArray()
            int[] r5 = r3.createIntArray()
            android.os.IBinder r0 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzf(r2, r5, r0)
            goto L6b
        L33:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzg(r2)
            goto L6b
        L42:
            r1.zzh()
            goto L6b
        L46:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            java.lang.String r5 = r3.readString()
            java.lang.String r0 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzi(r2, r5, r0)
            goto L6b
        L5d:
            android.os.Parcelable$Creator r2 = android.content.Intent.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            android.content.Intent r2 = (android.content.Intent) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zze(r2)
        L6b:
            r4.writeNoException()
            r2 = 1
            return r2
    }
}
