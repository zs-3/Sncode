package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbpk extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbpl {
    public zzbpk() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbpl zzf(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbpl
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbpl r0 = (com.google.android.gms.internal.ads.zzbpl) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbpj r0 = new com.google.android.gms.internal.ads.zzbpj
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L44
            r0 = 2
            if (r2 == r0) goto L32
            r0 = 3
            if (r2 == r0) goto L20
            r0 = 4
            if (r2 == r0) goto Le
            r2 = 0
            return r2
        Le:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            boolean r2 = r1.zzd(r2)
            r4.writeNoException()
            r4.writeInt(r2)
            goto L55
        L20:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            com.google.android.gms.internal.ads.zzbrk r2 = r1.zzc(r2)
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto L55
        L32:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            boolean r2 = r1.zze(r2)
            r4.writeNoException()
            r4.writeInt(r2)
            goto L55
        L44:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            com.google.android.gms.internal.ads.zzbpo r2 = r1.zzb(r2)
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
        L55:
            return r5
    }
}
