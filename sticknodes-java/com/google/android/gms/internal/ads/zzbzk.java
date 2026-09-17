package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbzk extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbzl {
    public zzbzk() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.signals.ISignalGenerator"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbzl zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.signals.ISignalGenerator"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbzl
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbzl r0 = (com.google.android.gms.internal.ads.zzbzl) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbzj r0 = new com.google.android.gms.internal.ads.zzbzj
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            r3 = this;
            r7 = 0
            switch(r4) {
                case 1: goto L115;
                case 2: goto L103;
                case 3: goto Leb;
                case 4: goto Lda;
                case 5: goto Lba;
                case 6: goto L99;
                case 7: goto L86;
                case 8: goto L73;
                case 9: goto L52;
                case 10: goto L31;
                case 11: goto L6;
                default: goto L4;
            }
        L4:
            r4 = 0
            return r4
        L6:
            android.os.IBinder r4 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r4)
            android.os.IBinder r7 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            java.lang.String r0 = r5.readString()
            android.os.IBinder r1 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            com.google.android.gms.dynamic.IObjectWrapper r4 = r3.zze(r4, r7, r0, r1)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r6, r4)
            goto L147
        L31:
            android.os.Parcelable$Creator r4 = android.net.Uri.CREATOR
            java.util.ArrayList r4 = r5.createTypedArrayList(r4)
            android.os.IBinder r7 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            android.os.IBinder r0 = r5.readStrongBinder()
            com.google.android.gms.internal.ads.zzbub r0 = com.google.android.gms.internal.ads.zzbua.zzb(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r3.zzh(r4, r7, r0)
            r6.writeNoException()
            goto L147
        L52:
            android.os.Parcelable$Creator r4 = android.net.Uri.CREATOR
            java.util.ArrayList r4 = r5.createTypedArrayList(r4)
            android.os.IBinder r7 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            android.os.IBinder r0 = r5.readStrongBinder()
            com.google.android.gms.internal.ads.zzbub r0 = com.google.android.gms.internal.ads.zzbua.zzb(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r3.zzi(r4, r7, r0)
            r6.writeNoException()
            goto L147
        L73:
            android.os.IBinder r4 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r4)
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r3.zzj(r4)
            r6.writeNoException()
            goto L147
        L86:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbuk> r4 = com.google.android.gms.internal.ads.zzbuk.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzayn.zza(r5, r4)
            com.google.android.gms.internal.ads.zzbuk r4 = (com.google.android.gms.internal.ads.zzbuk) r4
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r3.zzg(r4)
            r6.writeNoException()
            goto L147
        L99:
            android.os.Parcelable$Creator r4 = android.net.Uri.CREATOR
            java.util.ArrayList r4 = r5.createTypedArrayList(r4)
            android.os.IBinder r7 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            android.os.IBinder r0 = r5.readStrongBinder()
            com.google.android.gms.internal.ads.zzbub r0 = com.google.android.gms.internal.ads.zzbua.zzb(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r3.zzl(r4, r7, r0)
            r6.writeNoException()
            goto L147
        Lba:
            android.os.Parcelable$Creator r4 = android.net.Uri.CREATOR
            java.util.ArrayList r4 = r5.createTypedArrayList(r4)
            android.os.IBinder r7 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            android.os.IBinder r0 = r5.readStrongBinder()
            com.google.android.gms.internal.ads.zzbub r0 = com.google.android.gms.internal.ads.zzbua.zzb(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r3.zzm(r4, r7, r0)
            r6.writeNoException()
            goto L147
        Lda:
            android.os.IBinder r4 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r4)
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r6, r7)
            goto L147
        Leb:
            android.os.IBinder r4 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r4)
            android.os.IBinder r4 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r4)
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r6, r7)
            goto L147
        L103:
            android.os.IBinder r4 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r4)
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r3.zzk(r4)
            r6.writeNoException()
            goto L147
        L115:
            android.os.IBinder r4 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r4)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbzp> r0 = com.google.android.gms.internal.ads.zzbzp.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r5, r0)
            com.google.android.gms.internal.ads.zzbzp r0 = (com.google.android.gms.internal.ads.zzbzp) r0
            android.os.IBinder r1 = r5.readStrongBinder()
            if (r1 != 0) goto L12c
            goto L13e
        L12c:
            java.lang.String r7 = "com.google.android.gms.ads.internal.signals.ISignalCallback"
            android.os.IInterface r7 = r1.queryLocalInterface(r7)
            boolean r2 = r7 instanceof com.google.android.gms.internal.ads.zzbzi
            if (r2 == 0) goto L139
            com.google.android.gms.internal.ads.zzbzi r7 = (com.google.android.gms.internal.ads.zzbzi) r7
            goto L13e
        L139:
            com.google.android.gms.internal.ads.zzbzg r7 = new com.google.android.gms.internal.ads.zzbzg
            r7.<init>(r1)
        L13e:
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r3.zzf(r4, r0, r7)
            r6.writeNoException()
        L147:
            r4 = 1
            return r4
    }
}
