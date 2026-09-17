package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzftd extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzfte {
    public zzftd() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.gass.internal.clearcut.IGassClearcut"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            switch(r1) {
                case 2: goto L32;
                case 3: goto L3f;
                case 4: goto L2b;
                case 5: goto L24;
                case 6: goto L1d;
                case 7: goto L16;
                case 8: goto L5;
                default: goto L3;
            }
        L3:
            r1 = 0
            return r1
        L5:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            r2.readString()
            r2.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            goto L3f
        L16:
            r2.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            goto L3f
        L1d:
            r2.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            goto L3f
        L24:
            r2.createByteArray()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            goto L3f
        L2b:
            r2.createIntArray()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            goto L3f
        L32:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            r2.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
        L3f:
            r3.writeNoException()
            r1 = 1
            return r1
    }
}
