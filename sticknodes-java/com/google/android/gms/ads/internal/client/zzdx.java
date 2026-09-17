package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzdx extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzdy {
    public zzdx() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.ads.internal.client.zzdy zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.ads.internal.client.zzdy
            if (r1 == 0) goto L11
            com.google.android.gms.ads.internal.client.zzdy r0 = (com.google.android.gms.ads.internal.client.zzdy) r0
            return r0
        L11:
            com.google.android.gms.ads.internal.client.zzdw r0 = new com.google.android.gms.ads.internal.client.zzdw
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            switch(r1) {
                case 1: goto L3c;
                case 2: goto L31;
                case 3: goto L26;
                case 4: goto L1b;
                case 5: goto L10;
                case 6: goto L5;
                default: goto L3;
            }
        L3:
            r1 = 0
            return r1
        L5:
            java.lang.String r1 = r0.zzh()
            r3.writeNoException()
            r3.writeString(r1)
            goto L46
        L10:
            android.os.Bundle r1 = r0.zze()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r3, r1)
            goto L46
        L1b:
            com.google.android.gms.ads.internal.client.zzw r1 = r0.zzf()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r3, r1)
            goto L46
        L26:
            java.util.List r1 = r0.zzj()
            r3.writeNoException()
            r3.writeTypedList(r1)
            goto L46
        L31:
            java.lang.String r1 = r0.zzi()
            r3.writeNoException()
            r3.writeString(r1)
            goto L46
        L3c:
            java.lang.String r1 = r0.zzg()
            r3.writeNoException()
            r3.writeString(r1)
        L46:
            r1 = 1
            return r1
    }
}
