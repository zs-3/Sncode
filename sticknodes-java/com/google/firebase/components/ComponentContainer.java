package com.google.firebase.components;

/* loaded from: classes2.dex */
public interface ComponentContainer {

    /* renamed from: com.google.firebase.components.ComponentContainer$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static java.lang.Object $default$get(com.google.firebase.components.ComponentContainer r0, com.google.firebase.components.Qualified r1) {
                com.google.firebase.inject.Provider r0 = r0.getProvider(r1)
                if (r0 != 0) goto L8
                r0 = 0
                return r0
            L8:
                java.lang.Object r0 = r0.get()
                return r0
        }

        public static java.lang.Object $default$get(com.google.firebase.components.ComponentContainer r0, java.lang.Class r1) {
                com.google.firebase.components.Qualified r1 = com.google.firebase.components.Qualified.unqualified(r1)
                java.lang.Object r0 = r0.get(r1)
                return r0
        }

        public static com.google.firebase.inject.Deferred $default$getDeferred(com.google.firebase.components.ComponentContainer r0, java.lang.Class r1) {
                com.google.firebase.components.Qualified r1 = com.google.firebase.components.Qualified.unqualified(r1)
                com.google.firebase.inject.Deferred r0 = r0.getDeferred(r1)
                return r0
        }

        public static com.google.firebase.inject.Provider $default$getProvider(com.google.firebase.components.ComponentContainer r0, java.lang.Class r1) {
                com.google.firebase.components.Qualified r1 = com.google.firebase.components.Qualified.unqualified(r1)
                com.google.firebase.inject.Provider r0 = r0.getProvider(r1)
                return r0
        }

        public static java.util.Set $default$setOf(com.google.firebase.components.ComponentContainer r0, com.google.firebase.components.Qualified r1) {
                com.google.firebase.inject.Provider r0 = r0.setOfProvider(r1)
                java.lang.Object r0 = r0.get()
                java.util.Set r0 = (java.util.Set) r0
                return r0
        }

        public static java.util.Set $default$setOf(com.google.firebase.components.ComponentContainer r0, java.lang.Class r1) {
                com.google.firebase.components.Qualified r1 = com.google.firebase.components.Qualified.unqualified(r1)
                java.util.Set r0 = r0.setOf(r1)
                return r0
        }
    }

    <T> T get(com.google.firebase.components.Qualified<T> r1);

    <T> T get(java.lang.Class<T> r1);

    <T> com.google.firebase.inject.Deferred<T> getDeferred(com.google.firebase.components.Qualified<T> r1);

    <T> com.google.firebase.inject.Deferred<T> getDeferred(java.lang.Class<T> r1);

    <T> com.google.firebase.inject.Provider<T> getProvider(com.google.firebase.components.Qualified<T> r1);

    <T> com.google.firebase.inject.Provider<T> getProvider(java.lang.Class<T> r1);

    <T> java.util.Set<T> setOf(com.google.firebase.components.Qualified<T> r1);

    <T> java.util.Set<T> setOf(java.lang.Class<T> r1);

    <T> com.google.firebase.inject.Provider<java.util.Set<T>> setOfProvider(com.google.firebase.components.Qualified<T> r1);
}
