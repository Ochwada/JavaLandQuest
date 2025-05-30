package com.codeland;

import com.codeland.exceptions.BoxEmptyException;

public class HeroDashboard {

    /**
     * @param <T> The type of item stored in the box.
     */
    public static class MagicBox<T> {

        private T item;
        private boolean isEmpty = true;

        /**
         * Stores an item in the box
         *
         * @param item The item to Store
         */
        public void set(T item) {
            this.item = item;
            this.isEmpty = false;
        }

        /**
         * Retrieves the items from the box
         */
        public T get() throws BoxEmptyException {
            if (isEmpty) {
                throw new BoxEmptyException("The magic box is empty!");
            }
            return item;
        }

    }
}
