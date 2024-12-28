    /**
    * @param {number} n
    * @return {number}
    */
    var pivotInteger = function(n) {
        if (n === 1) {
            return 1;
        }

        for (let i = 2; i <= n; i++) {
            let sum1 = (i * (i - 1)) / 2;
            let sum2 = ((n + 1 + i) * (n - i)) / 2;
            if (sum1 === sum2) {
                return i;
            }
        }

        return -1;
    };
