package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzev;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public class zzet<MessageType extends com.google.android.gms.internal.auth.zzev<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.auth.zzet<MessageType, BuilderType>> extends com.google.android.gms.internal.auth.zzdp<MessageType, BuilderType> {
    protected com.google.android.gms.internal.auth.zzev zza;
    private final com.google.android.gms.internal.auth.zzev zzb;

    protected zzet(MessageType r2) {
            r1 = this;
            r1.<init>()
            r1.zzb = r2
            boolean r0 = r2.zzm()
            if (r0 != 0) goto L12
            com.google.android.gms.internal.auth.zzev r2 = r2.zzc()
            r1.zza = r2
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Default instance must be immutable."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.internal.auth.zzdp
    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.google.android.gms.internal.auth.zzet r0 = r1.zzb()
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzdp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.auth.zzdp zza() {
            r1 = this;
            com.google.android.gms.internal.auth.zzet r0 = r1.zzb()
            return r0
    }

    public final com.google.android.gms.internal.auth.zzet zzb() {
            r3 = this;
            com.google.android.gms.internal.auth.zzev r0 = r3.zzb
            r1 = 5
            r2 = 0
            java.lang.Object r0 = r0.zzn(r1, r2, r2)
            com.google.android.gms.internal.auth.zzet r0 = (com.google.android.gms.internal.auth.zzet) r0
            com.google.android.gms.internal.auth.zzev r1 = r3.zzc()
            r0.zza = r1
            return r0
    }

    public MessageType zzc() {
            r1 = this;
            com.google.android.gms.internal.auth.zzev r0 = r1.zza
            boolean r0 = r0.zzm()
            if (r0 != 0) goto Lb
            com.google.android.gms.internal.auth.zzev r0 = r1.zza
            return r0
        Lb:
            com.google.android.gms.internal.auth.zzev r0 = r1.zza
            r0.zzi()
            com.google.android.gms.internal.auth.zzev r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzfw
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.auth.zzfx zzd() {
            r1 = this;
            com.google.android.gms.internal.auth.zzev r0 = r1.zzc()
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzfy
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.auth.zzfx zze() {
            r1 = this;
            r0 = 0
            throw r0
    }
}
