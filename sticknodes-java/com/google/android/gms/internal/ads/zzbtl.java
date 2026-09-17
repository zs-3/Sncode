package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbtl extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbtm {
    public zzbtl() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbtm zzI(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbtm
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbtm r0 = (com.google.android.gms.internal.ads.zzbtm) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbtk r0 = new com.google.android.gms.internal.ads.zzbtk
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            switch(r2) {
                case 1: goto La3;
                case 2: goto L9f;
                case 3: goto L98;
                case 4: goto L91;
                case 5: goto L8a;
                case 6: goto L75;
                case 7: goto L6e;
                case 8: goto L67;
                case 9: goto L60;
                case 10: goto L59;
                case 11: goto L4c;
                case 12: goto L37;
                case 13: goto L24;
                case 14: goto L1c;
                case 15: goto L5;
                default: goto L3;
            }
        L3:
            r2 = 0
            return r2
        L5:
            int r2 = r3.readInt()
            java.lang.String[] r5 = r3.createStringArray()
            int[] r0 = r3.createIntArray()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzp(r2, r5, r0)
            r4.writeNoException()
            goto Lb4
        L1c:
            r1.zzv()
            r4.writeNoException()
            goto Lb4
        L24:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzk(r2)
            r4.writeNoException()
            goto Lb4
        L37:
            r3.readInt()
            r3.readInt()
            android.os.Parcelable$Creator r2 = android.content.Intent.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            android.content.Intent r2 = (android.content.Intent) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r4.writeNoException()
            goto Lb4
        L4c:
            boolean r2 = r1.zzH()
            r4.writeNoException()
            int r3 = com.google.android.gms.internal.ads.zzayn.zza
            r4.writeInt(r2)
            goto Lb4
        L59:
            r1.zzi()
            r4.writeNoException()
            goto Lb4
        L60:
            r1.zzx()
            r4.writeNoException()
            goto Lb4
        L67:
            r1.zzm()
            r4.writeNoException()
            goto Lb4
        L6e:
            r1.zzu()
            r4.writeNoException()
            goto Lb4
        L75:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzs(r2)
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r4, r2)
            goto Lb4
        L8a:
            r1.zzo()
            r4.writeNoException()
            goto Lb4
        L91:
            r1.zzr()
            r4.writeNoException()
            goto Lb4
        L98:
            r1.zzt()
            r4.writeNoException()
            goto Lb4
        L9f:
            r4.writeNoException()
            goto Lb4
        La3:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzl(r2)
            r4.writeNoException()
        Lb4:
            r2 = 1
            return r2
    }
}
