package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbgf extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbgg {
    public zzbgf() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbgg zzdA(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbgg
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbgg r0 = (com.google.android.gms.internal.ads.zzbgg) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbge r0 = new com.google.android.gms.internal.ads.zzbge
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            switch(r2) {
                case 1: goto L9f;
                case 2: goto L8d;
                case 3: goto L7b;
                case 4: goto L74;
                case 5: goto L63;
                case 6: goto L51;
                case 7: goto L3f;
                case 8: goto L18;
                case 9: goto L5;
                default: goto L3;
            }
        L3:
            r2 = 0
            return r2
        L5:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzdy(r2)
            r4.writeNoException()
            goto Lb4
        L18:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L20
            r2 = 0
            goto L34
        L20:
            java.lang.String r5 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzbfz
            if (r0 == 0) goto L2e
            r2 = r5
            com.google.android.gms.internal.ads.zzbfz r2 = (com.google.android.gms.internal.ads.zzbfz) r2
            goto L34
        L2e:
            com.google.android.gms.internal.ads.zzbfx r5 = new com.google.android.gms.internal.ads.zzbfx
            r5.<init>(r2)
            r2 = r5
        L34:
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzdx(r2)
            r4.writeNoException()
            goto Lb4
        L3f:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzd(r2)
            r4.writeNoException()
            goto Lb4
        L51:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzdw(r2)
            r4.writeNoException()
            goto Lb4
        L63:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            r3.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r4.writeNoException()
            goto Lb4
        L74:
            r1.zzc()
            r4.writeNoException()
            goto Lb4
        L7b:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzdz(r2)
            r4.writeNoException()
            goto Lb4
        L8d:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            com.google.android.gms.dynamic.IObjectWrapper r2 = r1.zzb(r2)
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            goto Lb4
        L9f:
            java.lang.String r2 = r3.readString()
            android.os.IBinder r5 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r5)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzdv(r2, r5)
            r4.writeNoException()
        Lb4:
            r2 = 1
            return r2
    }
}
