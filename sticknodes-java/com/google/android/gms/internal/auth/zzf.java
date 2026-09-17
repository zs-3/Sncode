package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public interface zzf extends android.os.IInterface {
    android.os.Bundle zzd(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException;

    android.os.Bundle zze(android.accounts.Account r1, java.lang.String r2, android.os.Bundle r3) throws android.os.RemoteException;

    android.os.Bundle zzf(android.accounts.Account r1) throws android.os.RemoteException;

    android.os.Bundle zzg(java.lang.String r1) throws android.os.RemoteException;

    com.google.android.gms.auth.AccountChangeEventsResponse zzh(com.google.android.gms.auth.AccountChangeEventsRequest r1) throws android.os.RemoteException;
}
