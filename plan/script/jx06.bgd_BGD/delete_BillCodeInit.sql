DELETE FROM pub_bcr_candiattr WHERE pk_nbcr = '0001ZZ100000000CDZMF';
DELETE FROM pub_bcr_elem WHERE pk_billcodebase in ( select pk_billcodebase from pub_bcr_RuleBase where nbcrcode = 'JX06' );
DELETE FROM pub_bcr_RuleBase WHERE nbcrcode = 'JX06';
DELETE FROM pub_bcr_nbcr WHERE pk_nbcr = '0001ZZ100000000CDZMF';
DELETE FROM pub_bcr_OrgRela WHERE pk_billcodebase = '0001ZZ100000000CDZMG';
DELETE FROM pub_bcr_RuleBase WHERE pk_billcodebase = '0001ZZ100000000CDZMG';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000CDZMH';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000CDZMI';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000CDZMJ';