package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public abstract class zzcc extends com.google.android.gms.internal.games.zzb implements com.google.android.gms.games.internal.zzcd {
    public zzcc() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesClient"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.games.zzb
    protected final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r2 = 1001(0x3e9, float:1.403E-42)
            if (r1 != r2) goto L10
            com.google.android.gms.internal.games.zzfr r1 = r0.zzb()
            r3.writeNoException()
            com.google.android.gms.internal.games.zzc.zze(r3, r1)
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }
}
