package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzco extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzcp {
    public zzco() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IClientApi"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) throws android.os.RemoteException {
            r6 = this;
            r10 = 0
            switch(r7) {
                case 1: goto L251;
                case 2: goto L221;
                case 3: goto L1fb;
                case 4: goto L1e9;
                case 5: goto L1ca;
                case 6: goto L1a7;
                case 7: goto L195;
                case 8: goto L17e;
                case 9: goto L163;
                case 10: goto L13c;
                case 11: goto L115;
                case 12: goto Lee;
                case 13: goto Lbd;
                case 14: goto L9a;
                case 15: goto L77;
                case 16: goto L4c;
                case 17: goto L29;
                case 18: goto L6;
                default: goto L4;
            }
        L4:
            r7 = 0
            return r7
        L6:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            android.os.IBinder r10 = r8.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpl r10 = com.google.android.gms.internal.ads.zzbpk.zzf(r10)
            int r0 = r8.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            com.google.android.gms.ads.internal.client.zzci r7 = r6.zzg(r7, r10, r0)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r7)
            goto L280
        L29:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            android.os.IBinder r10 = r8.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpl r10 = com.google.android.gms.internal.ads.zzbpk.zzf(r10)
            int r0 = r8.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            com.google.android.gms.ads.internal.client.zzdu r7 = r6.zzi(r7, r10, r0)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r7)
            goto L280
        L4c:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            android.os.IBinder r10 = r8.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpl r10 = com.google.android.gms.internal.ads.zzbpk.zzf(r10)
            int r0 = r8.readInt()
            android.os.IBinder r1 = r8.readStrongBinder()
            com.google.android.gms.internal.ads.zzbkv r1 = com.google.android.gms.internal.ads.zzbku.zzc(r1)
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            com.google.android.gms.internal.ads.zzbky r7 = r6.zzl(r7, r10, r0, r1)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r7)
            goto L280
        L77:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            android.os.IBinder r10 = r8.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpl r10 = com.google.android.gms.internal.ads.zzbpk.zzf(r10)
            int r0 = r8.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            com.google.android.gms.internal.ads.zzbtf r7 = r6.zzm(r7, r10, r0)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r7)
            goto L280
        L9a:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            android.os.IBinder r10 = r8.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpl r10 = com.google.android.gms.internal.ads.zzbpk.zzf(r10)
            int r0 = r8.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            com.google.android.gms.internal.ads.zzbzl r7 = r6.zzq(r7, r10, r0)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r7)
            goto L280
        Lbd:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzs> r7 = com.google.android.gms.ads.internal.client.zzs.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.ads.zzayn.zza(r8, r7)
            r2 = r7
            com.google.android.gms.ads.internal.client.zzs r2 = (com.google.android.gms.ads.internal.client.zzs) r2
            java.lang.String r3 = r8.readString()
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpl r4 = com.google.android.gms.internal.ads.zzbpk.zzf(r7)
            int r5 = r8.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            r0 = r6
            com.google.android.gms.ads.internal.client.zzby r7 = r0.zzc(r1, r2, r3, r4, r5)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r7)
            goto L280
        Lee:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            java.lang.String r10 = r8.readString()
            android.os.IBinder r0 = r8.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpl r0 = com.google.android.gms.internal.ads.zzbpk.zzf(r0)
            int r1 = r8.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            com.google.android.gms.internal.ads.zzbxf r7 = r6.zzp(r7, r10, r0, r1)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r7)
            goto L280
        L115:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            android.os.IBinder r10 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r10)
            android.os.IBinder r0 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            com.google.android.gms.internal.ads.zzbgm r7 = r6.zzk(r7, r10, r0)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r7)
            goto L280
        L13c:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzs> r10 = com.google.android.gms.ads.internal.client.zzs.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzayn.zza(r8, r10)
            com.google.android.gms.ads.internal.client.zzs r10 = (com.google.android.gms.ads.internal.client.zzs) r10
            java.lang.String r0 = r8.readString()
            int r1 = r8.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            com.google.android.gms.ads.internal.client.zzby r7 = r6.zzf(r7, r10, r0, r1)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r7)
            goto L280
        L163:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            int r10 = r8.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            com.google.android.gms.ads.internal.client.zzcz r7 = r6.zzh(r7, r10)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r7)
            goto L280
        L17e:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            com.google.android.gms.internal.ads.zzbtm r7 = r6.zzn(r7)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r7)
            goto L280
        L195:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r10)
            goto L280
        L1a7:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            android.os.IBinder r10 = r8.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpl r10 = com.google.android.gms.internal.ads.zzbpk.zzf(r10)
            int r0 = r8.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            com.google.android.gms.internal.ads.zzbwp r7 = r6.zzo(r7, r10, r0)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r7)
            goto L280
        L1ca:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            android.os.IBinder r10 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r10)
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            com.google.android.gms.internal.ads.zzbgg r7 = r6.zzj(r7, r10)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r7)
            goto L280
        L1e9:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r10)
            goto L280
        L1fb:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            java.lang.String r10 = r8.readString()
            android.os.IBinder r0 = r8.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpl r0 = com.google.android.gms.internal.ads.zzbpk.zzf(r0)
            int r1 = r8.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            com.google.android.gms.ads.internal.client.zzbu r7 = r6.zzb(r7, r10, r0, r1)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r7)
            goto L280
        L221:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzs> r7 = com.google.android.gms.ads.internal.client.zzs.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.ads.zzayn.zza(r8, r7)
            r2 = r7
            com.google.android.gms.ads.internal.client.zzs r2 = (com.google.android.gms.ads.internal.client.zzs) r2
            java.lang.String r3 = r8.readString()
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpl r4 = com.google.android.gms.internal.ads.zzbpk.zzf(r7)
            int r5 = r8.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            r0 = r6
            com.google.android.gms.ads.internal.client.zzby r7 = r0.zze(r1, r2, r3, r4, r5)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r7)
            goto L280
        L251:
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzs> r7 = com.google.android.gms.ads.internal.client.zzs.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.ads.zzayn.zza(r8, r7)
            r2 = r7
            com.google.android.gms.ads.internal.client.zzs r2 = (com.google.android.gms.ads.internal.client.zzs) r2
            java.lang.String r3 = r8.readString()
            android.os.IBinder r7 = r8.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpl r4 = com.google.android.gms.internal.ads.zzbpk.zzf(r7)
            int r5 = r8.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r8)
            r0 = r6
            com.google.android.gms.ads.internal.client.zzby r7 = r0.zzd(r1, r2, r3, r4, r5)
            r9.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r9, r7)
        L280:
            r7 = 1
            return r7
    }
}
