DELETE FROM pub_bcr_candiattr WHERE pk_nbcr = '0001ZZ100000000CDWS6';
DELETE FROM pub_bcr_elem WHERE pk_billcodebase in ( select pk_billcodebase from pub_bcr_RuleBase where nbcrcode = 'JX04' );
DELETE FROM pub_bcr_RuleBase WHERE nbcrcode = 'JX04';
DELETE FROM pub_bcr_nbcr WHERE pk_nbcr = '0001ZZ100000000CDWS6';
DELETE FROM pub_bcr_OrgRela WHERE pk_billcodebase = '0001ZZ100000000CDWS7';
DELETE FROM pub_bcr_RuleBase WHERE pk_billcodebase = '0001ZZ100000000CDWS7';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000CDWS8';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000CDWS9';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000CDWSA';