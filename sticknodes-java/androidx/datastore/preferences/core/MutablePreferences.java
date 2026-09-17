package androidx.datastore.preferences.core;

/* compiled from: Preferences.kt */
/* loaded from: classes.dex */
public final class MutablePreferences extends androidx.datastore.preferences.core.Preferences {
    private final java.util.concurrent.atomic.AtomicBoolean frozen;
    private final java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> preferencesMap;


    public MutablePreferences() {
            r3 = this;
            r0 = 0
            r1 = 0
            r2 = 3
            r3.<init>(r0, r1, r2, r0)
            return
    }

    public MutablePreferences(java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "preferencesMap"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.preferencesMap = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r3)
            r1.frozen = r2
            return
    }

    public /* synthetic */ MutablePreferences(java.util.Map r1, boolean r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L9
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
        L9:
            r3 = r3 & 2
            if (r3 == 0) goto Le
            r2 = 1
        Le:
            r0.<init>(r1, r2)
            return
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> asMap() {
            r2 = this;
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r0 = r2.preferencesMap
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            java.lang.String r1 = "unmodifiableMap(preferencesMap)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final void checkNotFrozen$datastore_preferences_core() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.frozen
            boolean r0 = r0.get()
            r0 = r0 ^ 1
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Do mutate preferences once returned to DataStore."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.datastore.preferences.core.MutablePreferences
            if (r0 == 0) goto Lf
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r0 = r1.preferencesMap
            androidx.datastore.preferences.core.MutablePreferences r2 = (androidx.datastore.preferences.core.MutablePreferences) r2
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r2 = r2.preferencesMap
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public final void freeze$datastore_preferences_core() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.frozen
            r1 = 1
            r0.set(r1)
            return
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public <T> T get(androidx.datastore.preferences.core.Preferences.Key<T> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r0 = r1.preferencesMap
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r0 = r1.preferencesMap
            int r0 = r0.hashCode()
            return r0
    }

    public final void putAll(androidx.datastore.preferences.core.Preferences.Pair<?>... r5) {
            r4 = this;
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r4.checkNotFrozen$datastore_preferences_core()
            int r0 = r5.length
            r1 = 0
        La:
            if (r1 >= r0) goto L1c
            r2 = r5[r1]
            androidx.datastore.preferences.core.Preferences$Key r3 = r2.getKey$datastore_preferences_core()
            java.lang.Object r2 = r2.getValue$datastore_preferences_core()
            r4.setUnchecked$datastore_preferences_core(r3, r2)
            int r1 = r1 + 1
            goto La
        L1c:
            return
    }

    public final <T> T remove(androidx.datastore.preferences.core.Preferences.Key<T> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.checkNotFrozen$datastore_preferences_core()
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r0 = r1.preferencesMap
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    public final <T> void set(androidx.datastore.preferences.core.Preferences.Key<T> r2, T r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.setUnchecked$datastore_preferences_core(r2, r3)
            return
    }

    public final void setUnchecked$datastore_preferences_core(androidx.datastore.preferences.core.Preferences.Key<?> r3, java.lang.Object r4) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.checkNotFrozen$datastore_preferences_core()
            if (r4 != 0) goto Le
            r2.remove(r3)
            goto L2c
        Le:
            boolean r0 = r4 instanceof java.util.Set
            if (r0 == 0) goto L27
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r0 = r2.preferencesMap
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Set r4 = kotlin.collections.CollectionsKt.toSet(r4)
            java.util.Set r4 = java.util.Collections.unmodifiableSet(r4)
            java.lang.String r1 = "unmodifiableSet(value.toSet())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            r0.put(r3, r4)
            goto L2c
        L27:
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r0 = r2.preferencesMap
            r0.put(r3, r4)
        L2c:
            return
    }

    public java.lang.String toString() {
            r10 = this;
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r0 = r10.preferencesMap
            java.util.Set r1 = r0.entrySet()
            androidx.datastore.preferences.core.MutablePreferences$toString$1 r7 = androidx.datastore.preferences.core.MutablePreferences.AnonymousClass1.INSTANCE
            java.lang.String r2 = ",\n"
            java.lang.String r3 = "{\n"
            java.lang.String r4 = "\n}"
            r5 = 0
            r6 = 0
            r8 = 24
            r9 = 0
            java.lang.String r0 = kotlin.collections.CollectionsKt.joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }
}
