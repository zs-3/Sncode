package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbpq extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbpr {
    public zzbpq() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbpr zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbpr
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbpr r0 = (com.google.android.gms.internal.ads.zzbpr) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbpp r0 = new com.google.android.gms.internal.ads.zzbpp
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            switch(r1) {
                case 1: goto Leb;
                case 2: goto Le7;
                case 3: goto Ldc;
                case 4: goto Ld8;
                case 5: goto Ld4;
                case 6: goto Ld0;
                case 7: goto Lb9;
                case 8: goto Lb5;
                case 9: goto La6;
                case 10: goto L98;
                case 11: goto L94;
                case 12: goto L8d;
                case 13: goto L89;
                case 14: goto L79;
                case 15: goto L74;
                case 16: goto L64;
                case 17: goto L58;
                case 18: goto L53;
                case 19: goto L46;
                case 20: goto L41;
                case 21: goto L35;
                case 22: goto L25;
                case 23: goto L15;
                case 24: goto L5;
                default: goto L3;
            }
        L3:
            r1 = 0
            return r1
        L5:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zze> r1 = com.google.android.gms.ads.internal.client.zze.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r2, r1)
            com.google.android.gms.ads.internal.client.zze r1 = (com.google.android.gms.ads.internal.client.zze) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzk(r1)
            goto Lee
        L15:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zze> r1 = com.google.android.gms.ads.internal.client.zze.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r2, r1)
            com.google.android.gms.ads.internal.client.zze r1 = (com.google.android.gms.ads.internal.client.zze) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzh(r1)
            goto Lee
        L25:
            int r1 = r2.readInt()
            java.lang.String r4 = r2.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzi(r1, r4)
            goto Lee
        L35:
            java.lang.String r1 = r2.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzl(r1)
            goto Lee
        L41:
            r0.zzx()
            goto Lee
        L46:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            goto Lee
        L53:
            r0.zzu()
            goto Lee
        L58:
            int r1 = r2.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzj(r1)
            goto Lee
        L64:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzbxc r1 = com.google.android.gms.internal.ads.zzbxb.zzb(r1)
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzt(r1)
            goto Lee
        L74:
            r0.zzw()
            goto Lee
        L79:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbwy> r1 = com.google.android.gms.internal.ads.zzbwy.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r2, r1)
            com.google.android.gms.internal.ads.zzbwy r1 = (com.google.android.gms.internal.ads.zzbwy) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzs(r1)
            goto Lee
        L89:
            r0.zzy()
            goto Lee
        L8d:
            r2.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            goto Lee
        L94:
            r0.zzv()
            goto Lee
        L98:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzbgv.zzb(r1)
            r2.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            goto Lee
        La6:
            java.lang.String r1 = r2.readString()
            java.lang.String r4 = r2.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzq(r1, r4)
            goto Lee
        Lb5:
            r0.zzm()
            goto Lee
        Lb9:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto Lc0
            goto Lcc
        Lc0:
            java.lang.String r4 = "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata"
            android.os.IInterface r1 = r1.queryLocalInterface(r4)
            boolean r4 = r1 instanceof com.google.android.gms.internal.ads.zzbpv
            if (r4 == 0) goto Lcc
            com.google.android.gms.internal.ads.zzbpv r1 = (com.google.android.gms.internal.ads.zzbpv) r1
        Lcc:
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            goto Lee
        Ld0:
            r0.zzo()
            goto Lee
        Ld4:
            r0.zzp()
            goto Lee
        Ld8:
            r0.zzn()
            goto Lee
        Ldc:
            int r1 = r2.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzg(r1)
            goto Lee
        Le7:
            r0.zzf()
            goto Lee
        Leb:
            r0.zze()
        Lee:
            r3.writeNoException()
            r1 = 1
            return r1
    }
}
