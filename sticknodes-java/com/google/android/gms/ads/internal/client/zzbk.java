package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbk extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzbl {
    public zzbk() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdListener"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            switch(r1) {
                case 1: goto L33;
                case 2: goto L28;
                case 3: goto L36;
                case 4: goto L24;
                case 5: goto L20;
                case 6: goto L1c;
                case 7: goto L18;
                case 8: goto L9;
                case 9: goto L5;
                default: goto L3;
            }
        L3:
            r1 = 0
            return r1
        L5:
            r0.zzk()
            goto L36
        L9:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zze> r1 = com.google.android.gms.ads.internal.client.zze.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r2, r1)
            com.google.android.gms.ads.internal.client.zze r1 = (com.google.android.gms.ads.internal.client.zze) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzf(r1)
            goto L36
        L18:
            r0.zzg()
            goto L36
        L1c:
            r0.zzc()
            goto L36
        L20:
            r0.zzj()
            goto L36
        L24:
            r0.zzi()
            goto L36
        L28:
            int r1 = r2.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zze(r1)
            goto L36
        L33:
            r0.zzd()
        L36:
            r3.writeNoException()
            r1 = 1
            return r1
    }
}
